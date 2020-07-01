@stories
Feature: the user wants to enter the automation demo site page and register correctly

  @exitoso
  Scenario Outline: Fill registration form on the page Automation Demo site
    Given than Carlos wants join to the website Automation Demo site
    When  Carlos fill the form with your data
      | name   | lastname   | address   | email   | phone   | gender   | hobbies   | languages   | skill   | country1   | country2   | year   | month   | day   | password1   | password2   |
      | <name> | <lastname> | <address> | <email> | <phone> | <gender> | <hobbies> | <languages> | <skill> | <country1> | <country2> | <year> | <month> | <day> | <password1> | <password2> |
    Then  verify that the registration was correct with the text Table Row.
    Examples:
      | name   | lastname | address                     | email          | phone      | gender | hobbies | languages | skill           | country1 | country2 | year | month | day | password1   | password2   |
      | Carlos | Mestra   | calle 9c 87-99 Valle Heaven | jose@gmail.com | 3126911943 | Male   | Movies  | English   | Adobe Photoshop | Colombia | Japan    | 1990 | July  | 2   | Qw123456789 | Qw123456789 |

