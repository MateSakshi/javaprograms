package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        //Adding five elements in fruit ArrayList
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Mango");
        fruit.add("Cherry");
        fruit.add("Strawberry");
        System.out.println(fruit);
        System.out.println();

        //Adding Grapes at 2nd index
        fruit.add(2,"Grapes");
        System.out.println("Adding element at 2nd index: " +fruit );
        System.out.println();

        //Accesing element of 3rd index
        System.out.println("Accessing element at 3rd index: "+fruit.get(3));
        System.out.println();

        //Replacing element at 1st index
        fruit.set(1,"Bluberry");
        System.out.println("Replacing element at 1st index: "+fruit);
        System.out.println();

        //Removing 4th index element
        fruit.remove(4);
        System.out.println("After romoving 4th index element: "+fruit);
        System.out.println();

        //Remove element Apple
        fruit.remove("Apple");
        System.out.println("After removing element Apple: "+fruit);
        System.out.println();

        //Check Mango exist in list
        System.out.println("Checking Mango exist in list: "+fruit.contains("Mango"));
        System.out.println();

        //Finding index of blueberry
        System.out.println("Index of Bluberry: "+fruit.indexOf("Bluberry"));
        System.out.println();

        //Element present in list
        System.out.println("Size of ArrayList: "+fruit.size());
        System.out.println();

        //Check list is empty
        System.out.println("Checking ArrayList Empty or Not: "+fruit.isEmpty());
        System.out.println();

        //Sorting the list
        Collections.sort(fruit);
        System.out.println("Ascending Order:" +fruit);
        System.out.println();

        //Accessing fruit element
        for(String fruits : fruit){
            System.out.println(fruits);
        }

        //Remove all the elements
        System.out.println();
        fruit.removeAll(fruit);
        System.out.println("After removing elements: "+fruit);
        System.out.println();

        //Creating new ArrayList
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Spinach");
        vegetables.add("Brinjal");
        vegetables.add("Cabbage");
        System.out.println(vegetables);
        System.out.println();

        //Merge to ArrayList
        fruit.addAll(vegetables);
        System.out.println("After adding vegetables into fruit: "+fruit);

    }
}
