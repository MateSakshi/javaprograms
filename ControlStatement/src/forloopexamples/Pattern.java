package forloopexamples;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        // for star pattern
        for(int i =1; i<=4; i++){         //outer loop for rows
            for(int j=1; j<=i; j++){      //inner loop for columns
                System.out.print("* ");
            }
            System.out.println();         //move to next line
        }

        System.out.println("-------------------");

        // for number pattern
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){            //for rows
            for(int j=1; j<=i; j++){        //for columns
                System.out.print(j+" ");
            }
            System.out.println();           //move to next line
        }
    }
}
