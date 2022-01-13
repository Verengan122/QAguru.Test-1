package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPages {

    SelenideElement
            nameInput = $("#firstName"),
            lastnameInput = $("[id=lastName]"),
            userEmailInput = $("#userEmail"),
            userNumberPhone = $("[id=userNumber]");
    public RegistrationPages typeNameInput(String nameInput) {
        this.nameInput.setValue(String.valueOf(this.nameInput));
        return this;
    }


}
