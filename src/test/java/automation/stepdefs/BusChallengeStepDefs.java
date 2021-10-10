package automation.stepdefs;

import automation.pageobjects.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BusChallengeStepDefs {
    CreateUserPage createUserPage;
    Covid19Page covid19Page;
    BusPage busPage;
    RestaurantPage restaurantPage;
    OfficePage officepage;
    LeaderBoardPage leaderBoardPage;

    @Given("User is on the Home page of the Covid-19 The Game Application")
    public void userIsOnTheHomePageOfTheCovidTheGameApplication() {
        createUserPage.open();
    }


    @When("User Creates a New Warrior by entering a warrior name {string}")
    public void userCreatesANewWarriorByEnteringAWarriorName(String userName) {
        createUserPage.createUserAndStartGame(userName);
    }

    @Then("Covid-19 Game page should be displayed")
    public void covidGamePageShouldBeDisplayed() {
        Assert.assertEquals("The Page title should be ", "COVID-19 THE GAME", covid19Page.getTitle());
    }

    @When("User attempts ‘Take the Bus Challenge’")
    public void userAttemptsTakeTheBusChallenge() {
        covid19Page.SelectTakeTheBusChallenge();
        Assert.assertEquals("The Page Label should be ", "Inside the Bus", busPage.getPopUpLabelText());
    }

    @When("user clicks the correct answer for bus challenge")
    public void userClicksTheCorrectAnswerForBus() {
        busPage.clickStart();
        busPage.clickAnswerButton();
    }

    @Then("Result for the bus challenge should be displayed")
    public void resultForTheChallengeShouldBeDisplayed() {
        Assert.assertEquals("The Result Screen Label text is:", "That is correct!", busPage.getResultLabelText());
    }

    @When("User clicks Check your final score")
    public void userClicksCheckYourFinalScore() {
        busPage.clickCheckYourFinalScoreButton();
    }

    @Then("Final score board should be displayed")
    public void finalScoreBoardShouldBeDisplayed() {
        //  Assert.assertEquals("The leaderBoard Page Label is:","COVID-19 THE GAME - LEADERBOARD",leaderBoardPage.getLeaderBoardLabel());
        System.out.println("Your score for the Game is: " + leaderBoardPage.findScoreOfWarrior1());
        leaderBoardPage.ContinueFight();
    }

}
