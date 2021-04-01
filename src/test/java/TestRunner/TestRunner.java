package TestRunner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features= "C:\\Users\\hp\\eclipse-workspace\\ForJenkins\\src\\test\\java\\Features"
		,glue = {"StepDefinitions"},
//		format = {"pretty", "html:test-output"},
		dryRun = false,
		monochrome = true,
		strict = true,
//		tags = "@Smoke, or @Sanity",
		plugin = {"pretty",
				   "html:test-output",
				   "json:target/result.json",
				   "junit:target/result.xml",
					
		}
		
		)

public class TestRunner {
	
	

}
