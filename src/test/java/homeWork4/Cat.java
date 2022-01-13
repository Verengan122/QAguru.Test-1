package homeWork4;

import java.util.Random;

public class Cat {
    private String [] statusInBox = {"Жив","Мёртв"};
    private String boxStatus;

    public Cat(String boxStatus) {
        this.boxStatus = boxStatus;
    }

    public void printСatStatus() {
        if (boxStatus.equals("Открыта")) {
            Random random = new Random();
            String condition = statusInBox[random.nextInt(2)];
            System.out.println("Состояние кота: " + condition);
        } else {
            System.out.println("Состояние кота - неопределенное");
        }
    }
}