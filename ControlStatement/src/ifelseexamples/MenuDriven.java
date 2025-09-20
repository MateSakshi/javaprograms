package ifelseexamples;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        //if else example
        int age = 20;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
        System.out.println("---------------------");


        //Nested if example
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("No is positive");
            if (n % 2 == 0) {
                System.out.println("No is even");
            } else {
                System.out.println("No is odd");
            }
        } else {
            System.out.println("No is negative");
        }
        System.out.println("--------------------");


        //Menu driven Program
        Scanner calculator = new Scanner(System.in);
        int num;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.print("Enter the choice:");
            num = calculator.nextInt();

            if(num==1 ||num==2||num==3||num==4) {
                System.out.println("Enter the first number:");
                double num1 = calculator.nextDouble();
                System.out.println("Enter the second number:");
                double num2 = calculator.nextDouble();

                if (num == 1) {
                    System.out.println("Result:" + (num1 + num2));
                } else if (num == 2) {
                    System.out.println("Result:" + (num1 - num2));
                } else if (num == 3) {
                    System.out.println("Result:" + (num1 * num2));
                } else if (num == 4) {
                    if (num2 != 0)
                        System.out.println("Result:" + (num1 / num2));
                    else
                        System.out.println("Number can not be divide by 0");
                }
            }else if (num == 5) {
                System.out.println("Exit");
            } else {
                System.out.println("Invalid choice");
            }
        } while (num != 5);

        calculator.close();
    }
}
