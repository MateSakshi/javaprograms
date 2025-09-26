package list;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();
        //Adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(20);

        System.out.println("Adding elements to List: "+number);

        //Conver list to set for remove duplicates
        Set<Integer> num = new HashSet<>(number);

        System.out.println("Removing duplicates: "+num);

    }
}
