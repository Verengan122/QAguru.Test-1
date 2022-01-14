package homeWork5.newTestForm.steps;

import com.codeborne.selenide.Condition;
import homeWork5.newTestForm.components.Calendar;
import homeWork5.newTestForm.components.Hobbies;
import homeWork5.newTestForm.components.StateAndCity;
import homeWork5.newTestForm.pages.RegistrationPage;

import java.io.File;

import static com.codeborne.selenide.Selenide.page;

public class RegistrationStep extends RegistrationPage {

    protected final RegistrationPage registrationPages;

    public RegistrationStep() {
        this.registrationPages = page(RegistrationPage.class);
    }
    public Calendar calendar = new Calendar();
    public Hobbies hobbies = new Hobbies();
    public StateAndCity stateAndCity = new StateAndCity();


    public RegistrationPage setFirstName (String value) {
        firstName.setValue(value);
        return this;
    }

    public RegistrationPage setLastName (String value) {
        lastname.setValue(value);
        return this;
    }

    public RegistrationPage setUserEmail (String value) {
        userEmail.setValue(value);
        return this;
    }
    public RegistrationPage setHobbies() {
        hobbies.setHobbies();
        return this;
    }

    public RegistrationPage setUserPhoneNumber (String value) {
        userNumberPhone.setValue(value);
        return this;
    }

    public RegistrationPage setUserMale (){
        userMale.click();
        return this;
    }

    public RegistrationPage setBirthDate (String value) {
        calendar.setDate(value);
        return this;
    }

    public RegistrationPage setLang (String value) {
        userLang.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setFile() {
        userFile.uploadFile(new File("src/test/resources/img/1.png"));
        return this;
    }

    public RegistrationPage setUserAddres (String value) {
        userAddres.setValue(value).scrollTo();
        return this;
    }

    public RegistrationPage setStateAndCity (String value) {
        stateAndCity.setStateAndCity();
        return this;
    }

    public RegistrationPage pressSubmit () {
        buttonSubmit.click();
        return this;
    }

    public RegistrationPage checkModal () {
        modal.shouldHave(Condition.visible);
        return this;
    }
    public RegistrationPage checkEverything(String text) {
        check.shouldHave(Condition.text("Male"));
        return this;
    }


}
