package HomeWork4;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            Box box = new Box();
            Cat cat = new Cat(box.getBoxStatus());
            box.printBoxStatus();
            cat.printСatStatus();
        }
    }
}
