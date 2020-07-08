// This is the base class for an animal in general with specified fields for (nearly) all animals
public class Animal {

    //Fields
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    //Constructor
    public Animal(String name, int brain, int body, int size, int weight){
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    //getter methods
    public String getName(){
        return this.name;
    }

    public int getBrain(){
        return this.brain;
    }

    public int getBody(){
        return this.body;
    }

    public int getSize(){
        return this.size;
    }

    public int getWeight(){
        return this.weight;
    }

    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal.move() called. Animal is moving at " + speed );

    }

}