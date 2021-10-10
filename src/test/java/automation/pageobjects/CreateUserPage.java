package automation.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CreateUserPage extends PageObject {

    By warriorTxtBox = By.id("worrior_username");
    By createWarriorButton = By.id("warrior");
    By startGameButton = By.id("start");

    public void createUserAndStartGame(String username) {
        getDriver().findElement(warriorTxtBox).clear();
        getDriver().findElement(warriorTxtBox).sendKeys(username);
        getDriver().findElement(createWarriorButton).click();
        getDriver().findElement(startGameButton).click();
    }
}
