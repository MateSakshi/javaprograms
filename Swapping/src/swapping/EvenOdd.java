package swapping;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        String result = (n % 2 == 0)?"Even":"Odd";

        System.out.println("Number is: "+result);

    }
}
