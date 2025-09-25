package swapping;

import java.util.ArrayList;
import java.util.Collections;

public class SwapList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        System.out.println("Before Swap: "+list);

        Collections.swap(list,0,1);

        System.out.println("After Swap: "+list);
    }
}
