package technology;

public class Laptop extends Computer {

    private boolean isIntelliJOpen;

    //constructors
    public Laptop(int screenWidth, int screenHeight, String yearOfManufactor) {
        super(screenWidth, screenHeight, yearOfManufactor);
        this.isIntelliJOpen = false;
    }

    public Laptop(int screenWidth, int screenHeight, String yearOfManufactor, boolean isIntelliJOpen) {
        super(screenWidth, screenHeight, yearOfManufactor);
        this.isIntelliJOpen = isIntelliJOpen;
    }

    //methods
    public void openIntelliJ() {
        this.isIntelliJOpen = true;

        System.out.println("IntelliJ is open");
    }

}
