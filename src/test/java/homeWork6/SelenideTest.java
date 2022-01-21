package homeWork6;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest {
    @Test
     void testFindIssueSelenide() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com/");
        $(".header-search-input").setValue("Verengan122/QAguru.Test-1").pressEnter();
        $$(".repo-list").first().$("a").click();
        $("#issues-tab").click();
        $(withText("#1")).should(Condition.visible);
    }
    @AfterEach
    public void saveSources() {
        WebSteps webSteps = new WebSteps();
        webSteps.attachPageSource();
    }
}
