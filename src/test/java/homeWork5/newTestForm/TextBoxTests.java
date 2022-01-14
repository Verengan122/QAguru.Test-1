package homeWork5.newTestForm;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import homeWork5.newTestForm.components.Calendar;
import homeWork5.newTestForm.steps.RegistrationStep;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 100000;
    }
    //setTimeout(function (){debugger},5000)
    RegistrationStep registrationSteps = new RegistrationStep();
    Faker faker = new Faker();

    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String mail = faker.internet().emailAddress();
    String num = faker.numerify("##########");
    String addres = faker.address().country() + " " +
            faker.address().cityName() + " " +
            faker.address().buildingNumber();
    String lang = "Eng";


    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        registrationSteps.setFirstName(firstName);
        registrationSteps.setLastName(lastName);
        registrationSteps.setUserEmail(mail);
        registrationSteps.setUserMale();
        registrationSteps.setUserPhoneNumber(num);
        registrationSteps.setBirthDate("");
        registrationSteps.setLang(lang);
        registrationSteps.setHobbies();
        registrationSteps.setFile();
        registrationSteps.setUserAddres(addres);
        registrationSteps.setStateAndCity("");
        registrationSteps.pressSubmit();


        registrationSteps.checkModal();

        registrationSteps.checkEverything("");

//        registrationSteps.checkEverything(firstName, lastName, mail, "Male", num, "07 March,1996", lang,
//                "Sports, Reading, Music", "2.png", addres, "NCR", "Delhi");
//        //Check
//        $(".table-responsive").shouldHave(text(Name));
//        $(".table-responsive").shouldHave(text(LastName));
//        $(".table-responsive").shouldHave(text(Mail));
//        $(".table-responsive").shouldHave(text(Num));
//        $(".table-responsive").shouldHave(text("Male"));
//        $(".table-responsive").shouldHave(text("Sports, Reading, Music"));
//        $(".table-responsive").shouldHave(text("07 March,1996"));
//        $(".table-responsive").shouldHave(text("1.png"));
//        $(".table-responsive").shouldHave(text(Eng));
//        $(".table-responsive").shouldHave(text(Addres));
//        $(".table-responsive").shouldHave(text(State));
//        $(".table-responsive").shouldHave(text(City));
    }
}
