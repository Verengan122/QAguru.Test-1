package homeWork5.newTestForm.components;

import com.github.javafaker.Faker;
import homeWork5.newTestForm.TextBoxTests;

import static com.codeborne.selenide.Selenide.$;


public class StateAndCity {

    public void setStateAndCity () {
        $("#state").click();
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#city").click();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
    }
}
