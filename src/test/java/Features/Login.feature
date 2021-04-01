Feature: Free CRM login

  #Scenario: Free CRM login test scenarios
  #Given User is on login Page
  #When Title of login page is free crm
  #Then User enters un
  #Then user enters password and clicks on login button
  #		And user is on home page
  
  @Smoke @Regression
  Scenario Outline: Free CRM login test cenarios
    Given User is on login Page
    When Title of login page is free crm
    Then User enters "<un>"
    Then user enters "<pw>" and clicks on login button
    And user is on home page

    Examples: 
      | un                        | pw        |
      | archana.anand53@gmail.com | Archana@1 |
      #| archana.anand53@gmail.com | Archana@1 |