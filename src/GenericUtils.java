/**
 * Utility class providing generic array operations.
 */
public class GenericUtils {
    /**
     * Reverses the given array in-place
     * @param <T>   the type of elements in the array
     * @param array the array to be reversed
     */
    public static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * Calculates the sum of all elements in the given array
     * @param <T>   the type of elements, must extend Number
     * @param array the array whose elements are summed
     * @return the sum of all elements as double
     */
    public static <T extends Number> double sum(T[] array) {
        double total = 0;
        for (T element : array) {
            total += element.doubleValue();
        }

        return total;
    }
}