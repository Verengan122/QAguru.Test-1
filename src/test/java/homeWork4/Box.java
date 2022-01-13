package homeWork4;


import java.util.Random;

public class Box {
    String [] statuses = {"Закрыта", "Открыта"};
    String boxStatus;

    public Box() {
        Random random = new Random();
        boxStatus = statuses[random.nextInt(2)];
    }

    public String getBoxStatus() {
        return boxStatus;
    }

    public void printBoxStatus() {
        System.out.println("Состояние коробки: " + getBoxStatus());
    }
}