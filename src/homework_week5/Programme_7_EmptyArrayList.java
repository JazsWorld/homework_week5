package homework_week5;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */

public class Programme_7_EmptyArrayList {

    public static void main(String[] args) {
        //arrays

        ArrayList<String> c1= new ArrayList<String>();

        c1.add("PHP");
        c1.add("JAVA");
        c1.add("ASP.NET");
        c1.add("JAVASCRIPT");
        c1.add("TYPESCRIPT");
        System.out.println("Original array list: " + c1);
        System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());

        c1.removeAll(c1);

        System.out.println("Array list after remove all elements "+c1);
        System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());
    }




}
