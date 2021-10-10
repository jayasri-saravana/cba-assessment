package automation.stepdefs;

import automation.pageobjects.Covid19Page;
import automation.pageobjects.OfficePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class goToOfficeStepdefs {
    Covid19Page covid19Page;
    OfficePage officePage;

    @When("User attempts ‘Go to Office’")
    public void userAttemptsGoToPublicPlaceChallenge(){
        covid19Page.SelectGoToTheOfficeChallenge();
        Assert.assertEquals("The Page Label should be ", "At the Office", officePage.getOfficePageLabel());

    }
    @When("user clicks the correct answer for Go to Office Challenge")
    public void userClicksTheCorrectAnswerForPublicPlace() {
        officePage.clickStart();
        officePage.clickAnswerButton();
    }

    @Then("Result for the office challenge should be displayed")
    public void resultForTheChallengeShouldBeDisplayed() {
        Assert.assertEquals("The Result Screen Label text is:","That is correct!", officePage.getResultLabelText());
    }



}
