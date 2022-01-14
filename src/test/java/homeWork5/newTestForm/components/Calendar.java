package homeWork5.newTestForm.components;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

public class Calendar {

    public void setDate() {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("March");
        $(".react-datepicker__year-select").selectOption("1996");
        $(".react-datepicker__day--007:not(.react-datepicker__day--outside-month)").click();
    }
}

