package technology;

public class Computer extends AbstractEntity {

    private int screenWidth;

    private int screenHeight;

    private String yearOfManufactor;


    public Computer(int screenWidth, int screenHeight, String yearOfManufactor) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.yearOfManufactor = yearOfManufactor;
    }

    public int processTwoPlusTwo() {
        return 2 + 2;
    }

    public void tellMeAJoke() {
        System.out.println("Knock, Knock.");
    }
}
