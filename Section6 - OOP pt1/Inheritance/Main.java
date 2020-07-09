public class Main{
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5); 

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");

        dog.eat();
        //dog.walk();
        dog.run();
        /*
            Example output for order of functions order calling from dog.run()
            Dog.run() called
            Dog.move() called
            Dog.movelegs() called
            Animal.move() called. Animal is moving at 10
        */
    }
}