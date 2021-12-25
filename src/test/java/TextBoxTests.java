import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.commands.ScrollTo;
import io.netty.handler.codec.http.multipart.FileUpload;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;
import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 100000;
    }
    //setTimeout(function (){debugger},5000)
    String Name = "Evgeny";
    String LastName = "Drahileu";
    String Mail ="ED@gmail.com";
    String Num = "37533133737";
    String Eng = "Eng";
    String Addres = "Belarus, Mohileu";
    String State = "NCR";
    String City = "Delhi";


    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("[id=firstName]").setValue(Name);
        $("[id=lastName]").setValue(LastName);
        $("#userEmail").setValue(Mail);
        $("[for=gender-radio-1]").click();
        $("[id=userNumber]").setValue(Num);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("March");
        $(".react-datepicker__year-select").selectOption("1996");
        $(".react-datepicker__day--007").click();
        $("[id=subjectsInput]").setValue(Eng).pressEnter();
        $("[for=hobbies-checkbox-1]").click();
        $("[for=hobbies-checkbox-2]").click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/img/1.png"));
        $("#currentAddress").setValue(Addres).scrollTo();
        $("#state").click();
        $("#react-select-3-input").setValue(State).pressEnter();
        $("#city").click();
        $("#react-select-4-input").setValue(City).pressEnter();
        $("#submit").click();
        $(".modal-content").shouldBe(visible);



    }


}
