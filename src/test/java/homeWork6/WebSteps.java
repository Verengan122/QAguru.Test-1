package homeWork6;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;

import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;



public class WebSteps {

    @Step("Открывыем главную страницу")
    public WebSteps openStartPage(String value) {
        open("https://github.com/");
        return this;
    }

    @Step("Ищем пользователя")
    public WebSteps findUser(String value) {
        $(".header-search-input").setValue("Verengan122/QAguru.Test-1").pressEnter();
        return this;
    }

    @Step("Выбираем репозиторий")
    public WebSteps selectingTheUsersRepository() {
        $$(".repo-list").first().$("a").click();
        return this;
    }

    @Step("Открываем IssueTab")
    public WebSteps openIssueTab () {
        $("#issues-tab").click();
        return this;
    }

    @Step("Проверяем наличие Issue с номером")
    public WebSteps shouldSeeIssueWithNumber () {
        $(withText("#2")).should(Condition.visible);
        return this;
    }

    @Attachment(value = "Screenshot", type = "text/html", fileExtension = "html")
    public byte[] attachPageSource() {
        return WebDriverRunner.source().getBytes(StandardCharsets.UTF_8);
    }

}


