package homework_week5;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Programme_9_HashMapKeyValue {
    public static void main(String[] args) {
            Map<String, Integer> people = new HashMap<String, Integer>();
            people.put("BMW", 11);
            people.put("Audi", 12);
            people.put("Toyato",13);
            people.put("Skoda",14);

            for (String i : people.keySet()) {
                System.out.println("key: " + i + " & " + " value: " + people.get(i));
            }
        }


}
