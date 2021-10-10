package automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LeaderBoardPage extends PageObject {
    By leaderBoardLabel = By.className("option-label");
    By userScore = By.xpath("//td[contains(text(),'warrior1')]/following-sibling::td");
    By continueFightingButton = By.id("leaderboard_link");

    public String getLeaderBoardLabel() {
        return getDriver().findElement(leaderBoardLabel).getText();
    }

    public String findScoreOfWarrior1() {
        return getDriver().findElement(userScore).getText();
    }

    public void ContinueFight() {
        getDriver().findElement(continueFightingButton).click();
    }

}
