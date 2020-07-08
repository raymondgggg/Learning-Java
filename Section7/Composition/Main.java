public class Main { //Composition is another component of OOP
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch", "Acer", 27, new Resolution(2540, 1440)); // <--- created an instance of a class when not needing the variable and to pass as argument
        Motherboard theMotherboard = new Motherboard("BT-200", "Asus", 4, 5, "v1.1");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
    }
}