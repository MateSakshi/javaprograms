import java.util.ArrayList;
import java.util.HashMap;

public class WrapperClassEx {
    public static void main(String[] args) {
        int a= 10;
        //Boxing
        Integer obj = Integer.valueOf(a);
        System.out.println("Boxing: " +obj);
        //Unboxing
        int intobj = obj.intValue();
        System.out.println("Unboxing: " +intobj);

        //Create an ArrayList to store Integer objects
        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);

        System.out.println("ArrayList of Integers: "+num);

    }
}
