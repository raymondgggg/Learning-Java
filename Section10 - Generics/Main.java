import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        /* What are Generics? 
        Generics allow us to create classes, interfaces, and methods that take types as 
        Parameters called type parameters */

        // The code that follows bellow is an example of using generics without
        // type parameters, BAD, never do it
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList n){
        for (Object i : n){
            System.out.println((Integer) i * 2);
        }
    }
}