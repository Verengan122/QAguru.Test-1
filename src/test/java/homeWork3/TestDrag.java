package homeWork3;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class TestDrag {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 100000;
    }

    @Test
    void fillFromTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B")).shouldBe(visible);





    }
}
