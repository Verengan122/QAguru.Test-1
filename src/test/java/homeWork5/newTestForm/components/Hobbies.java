package homeWork5.newTestForm.components;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.awt.*;

import static com.codeborne.selenide.Selenide.$;

public class Hobbies {
    public void setHobbies () {
        $("[for=hobbies-checkbox-1]").click();
        $("[for=hobbies-checkbox-2]").click();
        $("[for=hobbies-checkbox-3]").click();
    }
}
