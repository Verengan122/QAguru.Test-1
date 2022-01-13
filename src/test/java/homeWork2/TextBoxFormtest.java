package homeWork2;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxFormtest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 100000;
    }
    //setTimeout(function (){debugger},5000)
    String Name = "Evgeny";
    String LastName = "Drahileu";
    String Mail ="ED@gmail.com";
    String Num = "3753313373";
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
        //Check
        $(".table-responsive").shouldHave(text(Name));
        $(".table-responsive").shouldHave(text(LastName));
        $(".table-responsive").shouldHave(text(Mail));
        $(".table-responsive").shouldHave(text(Num));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("Sports, Reading"));
        $(".table-responsive").shouldHave(text("07 March,1996"));
        $(".table-responsive").shouldHave(text("1.png"));
        $(".table-responsive").shouldHave(text(Eng));
        $(".table-responsive").shouldHave(text(Addres));
        $(".table-responsive").shouldHave(text(State));
        $(".table-responsive").shouldHave(text(City));


    }


}
