public class Main{
    public static void main(String[] args) {
        /*In Java it is actually possible to nest a class within another
        class, there are four types of nested classes: 
            - Static nested classes
            - Non-Static nested class (inner class)
            - Local class (inner class defined inside a scope block)
            - Anonymous class (nested class w/o class name */

        Gearbox mcLaren = new Gearbox(6);

        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));

        //Most inner classes are actuall private 

        // Gearbox.Gear second = new Gearbox.Gear(2, 15.4); <--- Leads to error
       // System.out.println(second.driveSpeed(1000));
    }
}