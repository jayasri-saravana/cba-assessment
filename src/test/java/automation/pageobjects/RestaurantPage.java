package automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RestaurantPage extends PageObject {
    By restaurantAnswer1Button = By.id("restaurant_answer_1");
    By restaurantPageLabel= By.id("restaurant_title");
    By restaurantPopUpStartButton = By.id("restaurant_timer_start");
    By resultLabelText = By.xpath("//div[@id='restaurant_correct_modal']//h5[@id='staticBackdropLabel']");

    public void clickAnswerButton() {
        getDriver().findElement(restaurantAnswer1Button).click();
    }

    public String getRestaurantPageLabel(){
        return getDriver().findElement(restaurantPageLabel).getText();
    }
    public void clickStart(){
        getDriver().findElement(restaurantPopUpStartButton).click();
    }

    public String getResultLabelText(){
        return getDriver().findElement(resultLabelText).getAttribute("innerText");
    }

}