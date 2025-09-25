package swapping;

import java.util.ArrayList;

public class SwapWithTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swap: a = "+a+", b = "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: a = "+a+", b = "+b);
    }
}
