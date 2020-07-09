public class Main{
    public static void main(String[] args) {
        // What is an interface?
        /*
            An interface specifies methods that a particular Class
            that implements the interface MUST implement

            Interface provide common behavior that can be used by several classes
            by having them all implement the same interface, a way to standarize classes
        */

        //Deskphone rayPhone; can also be used
        ITelephone rayPhone;  //ITelephone rayPhone = new ITelephone(); is not possible since the interface has no implemented methods
        rayPhone = new DeskPhone(123456);

        rayPhone.powerOn();
        rayPhone.callPhone(123456);
        rayPhone.answer();

        //You define the interface, but the class implementation is the specific functionality of the abstract interface

        rayPhone = new MobilePhone(24689);
        rayPhone.powerOn();
        rayPhone.callPhone(24689);
        rayPhone.answer();

    }
}