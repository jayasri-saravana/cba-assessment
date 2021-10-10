package automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class OfficePage extends PageObject {
    By officeAnswer1Button= By.id("office_answer_1");
    By officePageLabel= By.className("option-label");
    By officePopUpStartButton = By.id("start");
    By resultLabelText = By.xpath("//div[@id='off_correct_modal']//h5[@id='staticBackdropLabel']");

    public void clickAnswerButton() {
        getDriver().findElement(officeAnswer1Button).click();
    }

    public String getOfficePageLabel(){
        return getDriver().findElement(officePageLabel).getText();
    }
    public void clickStart(){
        getDriver().findElement(officePopUpStartButton).click();
    }

    public String getResultLabelText(){
        return getDriver().findElement(resultLabelText).getAttribute("innerText");
    }
}
