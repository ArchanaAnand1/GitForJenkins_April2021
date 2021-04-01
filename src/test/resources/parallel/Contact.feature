Feature: Free CRM login

@Sanity
  Scenario Outline: Free CRM login test cenarios
    Given User is on login Page
    When Title of login page is free crm
    Then User enters "<un>"
    Then user enters "<pw>" and clicks on login button
    And user is on home page
    When user mouse over on contacts link
    Then use clicks on new cntact link
    Then user enters "<fn>" and "<ln>"
    Then user click son save button
    Then close browser

    #Then verify new contact created
    Examples: 
      | un                        | pw        | fn   | ln        |
      #| archana.anand53@gmail.com | Archana@1 | Ann  | Augistine |
      | archana.anand53@gmail.com | Archana@1 | Anna | John      |
