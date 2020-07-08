import java.util.ArrayList;

class IntClass{
    private int value;

    public IntClass(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("raymond");

        //ArrayList<int> strIntArrayList = new ArrayList<int>(); cannot do this because primitive types are not classes

        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
        intArrayList.add(new IntClass(44));

        Integer integer = new Integer(54);
        Double doubleVal = new Double(12.5);
        ArrayList<Integer> intArrayList1 = new ArrayList<Integer>();


        for (int i = 0; i <= 10; i++){ //Autoboxing 
            intArrayList1.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++){//Unboxing
            System.out.println(i + " -----> " + intArrayList1.get(i).valueOf(i));
        }
        Integer myIntValue = 56;

        ArrayList<Double> myDouble = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
            myDouble.add(dbl);
        }

        for (int i = 0; i < myDouble.size(); i++){
            System.out.println(i + " ---> " + myDouble.get(i)); // Java compiler does all the autoboxing and unboxing
        }


    }
}