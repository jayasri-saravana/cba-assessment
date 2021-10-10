package automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://responsivefight.herokuapp.com/covid")
public class Covid19Page extends PageObject {
    By areYouGameButton = By.id("news");
    By takeTheBusButton = By.id("bus");
    By goToAPublicPlaceButton = By.id("restaurant");
    By goToTheOfficeButton = By.id("office");

    public void selectAreYouGameChallenge() {
        getDriver().findElement(areYouGameButton).click();
    }

    public void SelectTakeTheBusChallenge() {
        getDriver().findElement(takeTheBusButton).click();
    }

    public void selectGoToAPublicPlaceChallenge() {
        getDriver().findElement(goToAPublicPlaceButton).click();
    }

    public void SelectGoToTheOfficeChallenge() {
        getDriver().findElement(goToTheOfficeButton).click();
    }

}
