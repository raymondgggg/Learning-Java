import java.util.Scanner;



public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {
    //     class ClickListener implements Button.OnClickListener{
    //         public ClickListener(){
    //             System.out.println("I've been attached");
    //         }
            
    //         @Override 
    //         public void onClick(String title){
    //             System.out.println(title + " was clicked");
    //         }
    //     }

    //     btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title){
                System.out.println(title + " was clicked");
            }
        });
        listen();


        /*In Java it is actually possible to nest a class within another
        class, there are four types of nested classes: 
            - Static nested classes
            - Non-Static nested class (inner class)
            - Local class (inner class defined inside a scope block)
            - Anonymous class (nested class w/o class name */

        // Gearbox mcLaren = new Gearbox(6);

        // mcLaren.addGear(1, 5.3); //This way of doing things encapsulates the gear class
        // mcLaren.addGear(2, 10.6);
        // mcLaren.addGear(3, 15.9);

        // mcLaren.operateClutch(true);
        // mcLaren.changeGear(1);
        // mcLaren.operateClutch(false);
        // System.out.println(mcLaren.wheelSpeed(1000));
        // mcLaren.changeGear(2);
        // System.out.println(mcLaren.wheelSpeed(1000));
        // mcLaren.operateClutch(true);
        // mcLaren.changeGear(3);
        // mcLaren.operateClutch(false);
        // System.out.println(mcLaren.wheelSpeed(6000));
        //Most inner classes are actuall private 

        // Gearbox.Gear second = new Gearbox.Gear(2, 15.4); <--- Leads to error
       // System.out.println(second.driveSpeed(1000));
    }
    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}