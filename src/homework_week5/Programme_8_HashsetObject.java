package homework_week5;
/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

import java.util.HashSet;

public class Programme_8_HashsetObject {

        //main method
        public static void main(String[] args) {
            HashSet<Integer> number = new HashSet<>();//HashSet object called number
            // adding value to the set
            number.add(1);
            number.add(3);
            number.add(4);
            number.add(7);
            number.add(8);

            //show which number are between 1 and 10 are in the set
            for (int i = 1; i <= 10; i++) {
                if (number.contains(i)) {
                    System.out.println(i + " was found in the set ");
                } else {
                    System.out.println(i + "was not found in the set");
                }
            }
        }
    }

