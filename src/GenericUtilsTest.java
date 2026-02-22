import java.util.Arrays;

/**
 * Test class for GenericUtils methods.
 */
public class GenericUtilsTest {

    public static void main(String[] args) {

        // --- Testing reverse() with an Integer array ---
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before reverse: " + Arrays.toString(numbers));
        GenericUtils.reverse(numbers);
        System.out.println("After reverse:  " + Arrays.toString(numbers));

        System.out.println();

        // --- Testing reverse() with a String array ---
        String[] words = {"apple", "banana", "cherry"};
        System.out.println("Before reverse: " + Arrays.toString(words));
        GenericUtils.reverse(words);
        System.out.println("After reverse:  " + Arrays.toString(words));

        System.out.println();

        // --- Testing sum() with an Integer array ---
        Integer[] intValues = {10, 20, 30, 40};
        System.out.println("Integer array: " + Arrays.toString(intValues));
        System.out.println("Sum: " + GenericUtils.sum(intValues));

        System.out.println();

        // --- Testing sum() with a Double array ---
        Double[] doubleValues = {1.5, 2.5, 3.0};
        System.out.println("Double array: " + Arrays.toString(doubleValues));
        System.out.println("Sum: " + GenericUtils.sum(doubleValues));

        System.out.println();

        // --- Testing sum() with a mixed Number array (Float) ---
        Float[] floatValues = {0.1f, 0.2f, 0.3f};
        System.out.println("Float array: " + Arrays.toString(floatValues));
        System.out.printf("Sum: %.1f%n", GenericUtils.sum(floatValues));

        System.out.println();

        // --- Edge case: single element array ---
        Integer[] single = {42};
        System.out.println("Single element before reverse: " + Arrays.toString(single));
        GenericUtils.reverse(single);
        System.out.println("Single element after reverse:  " + Arrays.toString(single));

        System.out.println();

        // --- Edge case: empty array ---
        Integer[] empty = {};
        System.out.println("Empty array sum: " + GenericUtils.sum(empty));
        GenericUtils.reverse(empty);
        System.out.println("Empty array after reverse: " + Arrays.toString(empty));
    }
}