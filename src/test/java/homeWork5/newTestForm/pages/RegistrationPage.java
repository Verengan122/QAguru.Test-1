package homeWork5.newTestForm.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import homeWork5.newTestForm.components.Calendar;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;


public class RegistrationPage {


    protected SelenideElement
            firstName = Selenide.$("[id=firstName]"),
            lastname = Selenide.$("[id=lastName]"),
            userEmail = Selenide.$("#userEmail"),
            userNumberPhone = Selenide.$("[id=userNumber]"),
            userSubject = Selenide.$("[id=subjectsInput]"),
            userHobbiesSport = Selenide.$("[for=hobbies-checkbox-1]"),
            userHobbiesReading = Selenide.$("[for=hobbies-checkbox-2]"),
            userHobbiesMusic = Selenide.$("[for=hobbies-checkbox-3]"),
            userAddress = Selenide.$("#currentAddress"),
            userMale = Selenide.$("[for=gender-radio-1]"),
            userFile = $("#uploadPicture"),
            buttonSubmit = $("#submit"),
            modal = $(".modal-content"),
            check = $(".table-responsive");

}
