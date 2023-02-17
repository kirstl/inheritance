package technology;

public class Program {

    public static void main(String[] args) {
        Smartphone iphone = new Smartphone(5, 23, "2000", true);
       // iphone.makeAPhoneCall("867-5309");
       int result = iphone.processTwoPlusTwo();
       //System.out.println(result);
        System.out.println(iphone.getId());

       Laptop macBook = new Laptop(43, 3333, "2020", true);

       System.out.println(macBook.getId());
       //macBook.openIntelliJ();

      int processLaptopAnswer = macBook.processTwoPlusTwo();
      //System.out.println(processLaptopAnswer);

        Computer desktop = new Computer(222, 2353, "1997");

        System.out.println("ID number: " + desktop.getId());

       // desktop.tellMeAJoke();




    }
}
