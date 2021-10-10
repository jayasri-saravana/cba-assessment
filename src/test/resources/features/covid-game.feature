Feature: Super Hero Super Villain Covid-Game

  @regression
  Scenario: Create new user
    Given User is on the Home page of the Covid-19 The Game Application
    When User Creates a New Warrior by entering a warrior name "warrior1"
    Then Covid-19 Game page should be displayed

  @regression
  Scenario: User Attempting ‘Take the Bus challenge’
    Given User is on the Covid-19 Game Page
    When User attempts ‘Take the Bus Challenge’
    When user clicks the correct answer for bus challenge
    Then Result for the bus challenge should be displayed
    When User clicks Check your final score
    Then Final score board should be displayed

  @regression
  Scenario: User Attempting ‘Go to Public Place Challenge’
    Given User is on the Covid-19 Game Page
    When User attempts ‘Go to Public Place Challenge’
    When user clicks the correct answer for public place challenge
    Then Result for the public place challenge should be displayed
    When User clicks Check your final score
    Then Final score board should be displayed

  @regression
  Scenario: User Attempting ‘Go to Office’ challenge
    Given User is on the Covid-19 Game Page
    When User attempts ‘Go to Office’
    When user clicks the correct answer for Go to Office Challenge
    Then Result for the office challenge should be displayed
    When User clicks Check your final score
    Then Final score board should be displayed