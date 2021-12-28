import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class TestGit {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 100000;
    }

    String SA = "SoftAssertions";
    String EW = "@ExtendWith";

    @Test
    void fillFromTest() {
        open("https://github.com/");
        $("[name = q]").setValue("Selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link").click();
        $("[data-filterable-for = wiki-pages-filter]").$(byText(SA)).scrollTo().shouldBe(visible).click();
        $$(".highlight-source-java").find(text(EW)).scrollTo().shouldBe(visible);





    }

}
