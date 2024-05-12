package homework_week5;
/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Programme_4_arraylist {

    //Array
    int colours[] = new int[10];

    //main method
    public static void main(String[] args) {

    // declared arraylist
        ArrayList<String> Multiplecolours = new ArrayList();

        // adding the value
        Multiplecolours.add("Pink");
        Multiplecolours.add("Blue");
        Multiplecolours.add("Green");
        Multiplecolours.add("Yellow");
        Multiplecolours.add("Violet");
        Multiplecolours.add("White");
        Multiplecolours.add("Grey");
        Multiplecolours.add("Brown");
        Multiplecolours.add("Red");
        Multiplecolours.add("Orange");
        Multiplecolours.add(null);

        for (String colours : Multiplecolours)
        {
            System.out.println(colours);
        }


    }

}
