package homework_week5;
/**
 * Write a Java program to reverse an array of integer values.
 */
import java.util.Arrays;

public class Programme_3_ReverseAnArray {
    //create method
    public void reverseArray() {
        int[] my_array1 = {10, 20, 30, 40, 50};
        System.out.println("Original array : " + Arrays.toString(my_array1));
        for (int i = 0; i < my_array1.length / 2; i++) {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : " + Arrays.toString(my_array1));
    }

    //main method
    public static void main(String[] args) {
        Programme_3_ReverseAnArray obj = new Programme_3_ReverseAnArray();
        obj.reverseArray();
    }
}
