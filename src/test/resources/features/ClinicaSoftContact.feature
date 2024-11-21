Feature: ClinicaSoft Contactanos

  Scenario Outline: As a user I want to see the <page> options
    Given  the user is located in ClinicaSoft
    When the user wants to navigate to <page>

    Examples:
      | page     |
      | Services |
      | Team     |
      | Pages    |
      | Contact  |
      | Home     |
