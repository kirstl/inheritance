package technology;

public class Smartphone extends Computer {

    private boolean isConnectedTo5g;

    //constructors
    public Smartphone(int screenWidth, int screenHeight, String yearOfManufactor, boolean isConnectedTo5g) {
        super(screenWidth, screenHeight, yearOfManufactor);
        this.isConnectedTo5g = isConnectedTo5g;
    }

    //methods

    public void makeAPhoneCall(String number)  {
        System.out.println("Calling " + number);
    }
}
