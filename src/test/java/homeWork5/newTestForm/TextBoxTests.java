package homeWork5.newTestForm;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import homeWork5.newTestForm.components.Calendar;
import homeWork5.newTestForm.steps.RegistrationStep;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 100000;
    }
    //setTimeout(function (){debugger},5000)
    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String mail =faker.internet().emailAddress();
    String num = faker.numerify("##########");
    String addres = faker.address().country() + " " +
                    faker.address().cityName() + " " +
                    faker.address().buildingNumber();
    String lang = "Eng";
    String state = "NCR";
    String city = "Delhi";
    RegistrationStep registrationSteps = new RegistrationStep();
    Calendar calendar = new Calendar();


    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        registrationSteps.setFirstName(firstName);
        registrationSteps.setLastName(lastName);
        registrationSteps.setUserEmail(mail);
        registrationSteps.setUserPhoneNumber(num);
        registrationSteps.setBirthDate("");
        registrationSteps.setLang(lang);
        registrationSteps.setHobbies("");
        sleep(10000);

//        $("[for=hobbies-checkbox-2]").click();
//        $("#uploadPicture").uploadFile(new File("src/test/resources/img/1.png"));

//        $("#currentAddress").setValue(addres).scrollTo();
//        $("#state").click();
//        $("#react-select-3-input").setValue(state).pressEnter();
//        $("#city").click();
//        $("#react-select-4-input").setValue(city).pressEnter();
//        $("#submit").click();
//        $(".modal-content").shouldBe(visible);
//        //Check
//        $(".table-responsive").shouldHave(text(Name));
//        $(".table-responsive").shouldHave(text(LastName));
//        $(".table-responsive").shouldHave(text(Mail));
//        $(".table-responsive").shouldHave(text(Num));
//        $(".table-responsive").shouldHave(text("Male"));
//        $(".table-responsive").shouldHave(text("Sports, Reading"));
//        $(".table-responsive").shouldHave(text("07 March,1996"));
//        $(".table-responsive").shouldHave(text("1.png"));
//        $(".table-responsive").shouldHave(text(Eng));
//        $(".table-responsive").shouldHave(text(Addres));
//        $(".table-responsive").shouldHave(text(State));
//        $(".table-responsive").shouldHave(text(City));
    }
}
