package homeWork5.newTestForm.steps;

import homeWork5.newTestForm.components.Calendar;
import homeWork5.newTestForm.pages.RegistrationPage;

import java.awt.*;

import static com.codeborne.selenide.Selenide.page;

public class RegistrationStep extends RegistrationPage {

    protected final RegistrationPage registrationPages;

    public RegistrationStep() {
        this.registrationPages = page(RegistrationPage.class);
    }
    public Calendar calendar = new Calendar();


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

    public RegistrationPage setUserPhoneNumber (String value) {
        userNumberPhone.setValue(value);
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

    public RegistrationPage setHobbies (String value) {
        userHobbies.click();
        return this;
    }

    public RegistrationPage setUserAddres (String value) {
        userAddres.setValue(value).scrollTo();
        return this;
    }

}
