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
            userLang = Selenide.$("[id=subjectsInput]"),
            userHobbies = Selenide.$("[for=hobbies-checkbox-1]"),
            userAddres = Selenide.$("#currentAddress"),
            userMale = Selenide.$("[for=gender-radio-1]"),
            userFile = $("#uploadPicture"),
            buttonSubmit = $("#submit"),
            modal = $(".modal-content"),
            check = $(".table-responsive");
//    $("#uploadPicture").uploadFile(new File("src/test/resources/img/1.png"));





}
