package homeWork6;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.partialLinkText;


public class StepsTest {
    WebSteps webSteps = new WebSteps();
    @Test
    void TestFindIssueBySteps() {

        webSteps.openStartPage("https://github.com/")
                .findUser("Verengan122/QAguru.Test-1")
                .selectingTheUsersRepository()
                .openIssueTab()
                .shouldSeeIssueWithNumber();
    }
    @AfterEach
    public void saveSources() {
        webSteps.attachPageSource();
    }
}