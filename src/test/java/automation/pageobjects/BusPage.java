package automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BusPage extends PageObject {
    By busAnswer1Button = By.id("bus_answer_1");
    By busAnswer2Button = By.id("bus_answer_2");
    By popUpStartButton = By.id("bus_timer_start");
    By popUpLabelText = By.id("bus_title");
    By checkYourFinalScoreButton = By.id("leaderboard_link");
    By resultLabelText = By.xpath("//div[@id='bus_correct_modal']//h5[@id='staticBackdropLabel']");

    public void clickAnswerButton() {
        getDriver().findElement(busAnswer1Button).click();
    }

    public void clickStart() {
        getDriver().findElement(popUpStartButton).click();
    }

    public String getPopUpLabelText() {
        return getDriver().findElement(popUpLabelText).getText();
    }

    public void clickCheckYourFinalScoreButton() {
        getDriver().findElement(checkYourFinalScoreButton).click();
    }

    public String getResultLabelText() {
        return getDriver().findElement(resultLabelText).getAttribute("innerText");
    }
}
