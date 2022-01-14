package homeWork5.newTestForm;
import com.github.javafaker.Faker;
import homeWork5.newTestForm.steps.RegistrationStep;
import homeWork5.newTestForm.testBase.TestBase;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests extends TestBase {

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
        new RegistrationStep()
                .openRegistrationPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(mail)
                .setUserMale()
                .setUserPhoneNumber(num)
                .setBirthDate("")
                .setLang(lang)
                .setHobbies("Sports", "Reading", "Music")
                .setFile()
                .setUserAddres(addres)
                .setStateAndCity("")
                .pressSubmit()

                .checkModalIsVisible()

                .checkFieldFromResultPracticeForm("Student Name", firstName + " " + lastName)
                .checkFieldFromResultPracticeForm("Student Email", mail)
                .checkFieldFromResultPracticeForm("Mobile", num)
                .checkFieldFromResultPracticeForm("Gender", "Male")
                .checkFieldFromResultPracticeForm("Subjects", lang)
                .checkFieldFromResultPracticeForm("Date of Birth", "07 March,1996")
                .checkFieldFromResultPracticeForm("Hobbies", "Sports, Reading, Music")
                .checkFieldFromResultPracticeForm("Picture", "1.png")
                .checkFieldFromResultPracticeForm("Address", addres)
                .checkFieldFromResultPracticeForm("State and City", "NCR Delhi");

    }
}
