Feature: User Checking Functionality

  Scenario: User should navigate to contact us link successfully

    Given I am on the Homepage
    When I mouseHover on contact us link
    And I click on our story link
    Then I should see 'story link' text