import javax.xml.namespace.QName;

public class Dog extends Animal{ //When you use the extends keyword without constructor in Dog class you will get an error
    //Dog fields
    private int eyes; 
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //Base characteristics
    public Dog(String name, int size, int weight,int eyes, int legs, int tail, int teeth, String coat){
        super(name, 1, 1, size, weight); //What super means is to call the constructor from the class we are extending (or inheriting) from
        this.eyes = eyes;               //All dogs have one braing and body in super method
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.movelegs() called");
    }
    @Override // WHen you override a method in a class that extends from super class, the method that is overwritten will be called
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    

}