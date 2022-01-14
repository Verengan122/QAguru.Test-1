package homeWork5.newTestForm.steps;

import com.codeborne.selenide.Condition;
import homeWork5.newTestForm.components.Calendar;
import homeWork5.newTestForm.components.StateAndCity;
import homeWork5.newTestForm.pages.RegistrationPage;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationStep extends RegistrationPage {

    public Calendar calendar = new Calendar();
    public StateAndCity stateAndCity = new StateAndCity();

    public RegistrationStep openRegistrationPage() {
        open("https://demoqa.com/automation-practice-form");
        return this;
    }

    public RegistrationStep setFirstName(String value) {
        firstName.setValue(value);
        return this;
    }

    public RegistrationStep setLastName(String value) {
        lastname.setValue(value);
        return this;
    }

    public RegistrationStep setUserEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public RegistrationStep setUserPhoneNumber(String value) {
        userNumberPhone.setValue(value);
        return this;
    }

    public RegistrationStep setUserMale() {
        userMale.click();
        return this;
    }

    public RegistrationStep setBirthDate() {
        calendar.setDate();
        return this;
    }

    public RegistrationStep setLang(String value) {
        userSubject.setValue(value).pressEnter();
        return this;
    }

    public RegistrationStep setHobbies(String... hobbies) {
        for (int i = 0; i < hobbies.length; i++) {
            if (hobbies[i].equals("Sports")) userHobbiesSport.click();
            else if (hobbies[i].equals("Reading")) userHobbiesReading.click();
            else if (hobbies[i].equals("Music")) userHobbiesMusic.click();
        }
        return this;
    }

    public RegistrationStep setFile() {
        userFile.uploadFile(new File("src/test/resources/img/1.png"));
        return this;
    }

    public RegistrationStep setUserAddress(String value) {
        userAddress.setValue(value).scrollTo();
        return this;
    }

    public RegistrationStep setStateAndCity() {
        stateAndCity.setStateAndCity();
        return this;
    }

    public RegistrationStep pressSubmit() {
        buttonSubmit.click();
        return this;
    }

    public RegistrationStep checkModalIsVisible() {
        modal.shouldHave(Condition.visible);
        return this;
    }

    public RegistrationStep checkFieldFromResultPracticeForm(String label, String value) {
        check.$(byText(label)).parent().shouldHave(text(value));
        return this;
    }
}
