Feature: Example WIP

  Background:
    Given Eg2: A user go to the page "http://google.com"


  Scenario: Eg2: Cucumber Scenario 01  -> WIP
    And  Eg2: A user search for "selenium webDriver"
    When Eg2: A user see list of result is show
    And  Eg2: A user Click on the first item
    Then Eg2: the Selenium official page is show

  Scenario: Eg2: Cucumber Scenario 02 DataTable -> WIP
    And Eg2: A user search for items
      | Selenium   | Web Driver          |
      | Automation | testing             |
      |            | Selenium Web Driver |
    When Eg2: A user see list of result is show
    And  Eg2: A user Click on the first item
    Then Eg2: the Selenium official page is show
#    And It will failure

  @WIP
  Scenario Outline: Eg2: Cucumber Scenario 03 Scenario Outline -> WIP
    And  Eg2: A user search for <firstName> <secondName> <lestName>
    When Eg2: A user see list of result is show
    And  Eg2: A user Click on the first item
    Then Eg2: the Selenium official page is show <pageTitle>

    Examples:
      | firstName | secondName | lestName | pageTitle                         |
      | Selenium  | Web        | Driver   | Selenium WebDriver                |
#      | Selenium  | hq         |          | Selenium - Web Browser Automation |
