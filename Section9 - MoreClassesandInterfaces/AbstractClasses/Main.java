public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog("Tucker");
        dog.breathe();
        dog.eat();

        Parrot bird = new Parrot("Ray");
        bird.breathe();
        bird.eat();
        
        bird.fly();

        Penguin pen = new Penguin("Rick");
        pen.fly();
    }

    /* Abstract class vs Interface
    An abstact class can have member variables that are inherited, this cannot be done in an interface, interfaces
    can have variables, but they are all public static final variables they have static scopes, interfaces cannot have constructors
    but abstract classes can, all the methods in an interface are public, but the methods in an abstract class can have whatever type of visibility
    Abstract classes can have defined methods, where all the methods in an interface are abstract*/
}