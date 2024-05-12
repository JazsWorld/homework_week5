package homework_week5;
/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5_Iterator {
    //main method
    public static void main(String[] args) {
        //arraylist
        ArrayList<String> countryName = new ArrayList();
        countryName.add("India");
        countryName.add("United Kingdom");
        countryName.add("Austrialia");
        countryName.add("Europe");
        countryName.add("United States");
        System.out.println("ArrayList: " + countryName);

        Iterator itr = countryName.iterator();
        System.out.println("Iterating through ArrayList:1 ");
        while (itr.hasNext())
        {
            // return next element of the Arraylist
            System.out.println(itr.next());
        }
    }

}
