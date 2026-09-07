import java.util.Arrays;

/**
 * A2Z DSA - #8 Pass by Reference / Value
 *
 * Reverse an array in-place.
 *
 * Important Java concept:
 * Java is always pass-by-value.
 * For arrays, the value passed is a copy of the array reference.
 */
class PassByReference {

    /**
     * Reverses the given array in-place.
     */
    public void reverse(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        PassByReference solution = new PassByReference();

        int[] arr1 = {1, 2, 3, 4, 5};
        solution.reverse(arr1);
        System.out.println(Arrays.toString(arr1));
        // [5, 4, 3, 2, 1]

        int[] arr2 = {1, 2, 1, 1, 5, 1};
        solution.reverse(arr2);
        System.out.println(Arrays.toString(arr2));
        // [1, 5, 1, 1, 2, 1]

        int[] arr3 = {7};
        solution.reverse(arr3);
        System.out.println(Arrays.toString(arr3));
        // [7]
    }
}