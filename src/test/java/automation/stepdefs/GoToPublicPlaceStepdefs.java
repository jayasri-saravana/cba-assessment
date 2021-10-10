package automation.stepdefs;

import automation.pageobjects.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoToPublicPlaceStepdefs {
    Covid19Page covid19Page;
    RestaurantPage restaurantPage;

    @Given("User is on the Covid-19 Game Page")

    public void userIsOnTheCovid19GamePage() {
        covid19Page.open();
    }

    @When("User attempts ‘Go to Public Place Challenge’")
    public void userAttemptsGoToPublicPlaceChallenge() {
        covid19Page.selectGoToAPublicPlaceChallenge();
        Assert.assertEquals("The Page Label should be ", "At the Restaurant", restaurantPage.getRestaurantPageLabel());
    }

    @When("user clicks the correct answer for public place challenge")
    public void userClicksTheCorrectAnswerForPublicPlace() {
        restaurantPage.clickStart();
        restaurantPage.clickAnswerButton();
    }

    @Then("Result for the public place challenge should be displayed")
    public void resultForTheChallengeShouldBeDisplayed() {
        Assert.assertEquals("The Result Screen Label text is:","That is correct!", restaurantPage.getResultLabelText());
    }
}

