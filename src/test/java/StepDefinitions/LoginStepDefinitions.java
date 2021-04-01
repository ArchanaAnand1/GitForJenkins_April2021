package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginStepDefinitions {

	static WebDriver driver;

	@Given("^User is on login Page$")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@When("^Title of login page is free crm$")
	public void title_of_login_page_is_free_crm() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);

	}

	@Then("^User enters \"(.*)\"$")
	public void user_enters_un(String un) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("email")).sendKeys(un);
		;

	}

	@Then("^user enters \"(.*)\" and clicks on login button$")
	public void user_enters_password_and_clicks_on_login_button(String pw) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys(pw);
		;
		driver.findElement(By.xpath("//div[contains(.,'Login') and contains(@class,'submit button')]")).click();

	}

	@And("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {

		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
		

	}
	
	
	@Given("^user is already on home page$")
	public void user_is_already_on_home_page() throws Throwable {
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}

	@When("^user mouse over on contacts link$")
	public void user_mouse_over_on_contacts_link() throws Throwable {
	    Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("//a[@href='/contacts']")));
	    act.perform();
	    
	    
	}

	@Then("^use clicks on new cntact link$")
	public void use_clicks_on_new_cntact_link() throws Throwable {
		driver.findElement(By.xpath("//a[@href='/contacts']/following-sibling::button")).click();
	}

	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_first_name_and_last_name(String fn,  String ln) throws Throwable {
		WebElement un = driver.findElement(By.name("first_name"));
		Actions act = new Actions(driver);
		act.moveByOffset(100, 100);
//		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('value', '"+fn+"');", un);
		un.sendKeys(fn);
	    driver.findElement(By.name("last_name")).sendKeys(ln);
	    
	}

	@Then("^user click son save button$")
	public void user_click_son_save_button() throws Throwable {
	   driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
	   Thread.sleep(5000);
	}

	@Then("^verify new contact created$")
	public void verify_new_contact_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("^close browser$")
	public void close() {
		driver.quit();
	}

}
