/*
 * A2Z DSA — #5 What are Arrays, Strings?
 *
 * Purpose:
 * Revision of basic arrays and strings in Java before starting
 * array and string based DSA problems.
 *
 * Topics:
 * - Array declaration and initialization
 * - Array indexing and updating
 * - Array length
 * - Array traversal
 * - Enhanced for loop
 * - 2D arrays
 * - String basics
 * - String methods
 * - Character traversal
 * - String immutability
 *
 * Language: Java
 */

import java.util.Arrays;

public class ArraysAndStrings {

    public static void main(String[] args) {

        // --------------------------------------------------
        // 1. Array Declaration and Initialization
        // --------------------------------------------------

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array: " + Arrays.toString(numbers));


        // --------------------------------------------------
        // 2. Array Indexing
        // --------------------------------------------------

        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);


        // --------------------------------------------------
        // 3. Updating an Array Element
        // --------------------------------------------------

        numbers[1] = 25;

        System.out.println("After updating: " + Arrays.toString(numbers));


        // --------------------------------------------------
        // 4. Array Length
        // --------------------------------------------------

        System.out.println("Array length: " + numbers.length);


        // --------------------------------------------------
        // 5. Traversing an Array Using for Loop
        // --------------------------------------------------

        System.out.println("Using normal for loop:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        // --------------------------------------------------
        // 6. Traversing an Array Using Enhanced for Loop
        // --------------------------------------------------

        System.out.println("Using enhanced for loop:");

        for (int number : numbers) {
            System.out.println(number);
        }


        // --------------------------------------------------
        // 7. Creating an Array with a Fixed Size
        // --------------------------------------------------

        int[] values = new int[5];

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println("Fixed-size array: " + Arrays.toString(values));


        // --------------------------------------------------
        // 8. Basic 2D Array
        // --------------------------------------------------

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("2D array:");

        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }

            System.out.println();
        }


        // --------------------------------------------------
        // 9. String Basics
        // --------------------------------------------------

        String name = "NewTon";

        System.out.println("String: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("First character: " + name.charAt(0));


        // --------------------------------------------------
        // 10. String Concatenation
        // --------------------------------------------------

        String firstName = "New";
        String lastName = "Ton";

        String fullName = firstName + lastName;

        System.out.println("Full name: " + fullName);


        // --------------------------------------------------
        // 11. Comparing Strings
        // --------------------------------------------------

        String first = "Java";
        String second = "Java";

        System.out.println("Strings equal: " + first.equals(second));


        // --------------------------------------------------
        // 12. Traversing a String
        // --------------------------------------------------

        String language = "Java";

        System.out.println("Characters:");

        for (int i = 0; i < language.length(); i++) {
            System.out.println(language.charAt(i));
        }


        // --------------------------------------------------
        // 13. Convert String to Character Array
        // --------------------------------------------------

        char[] characters = language.toCharArray();

        System.out.println("Character array: " + Arrays.toString(characters));


        // --------------------------------------------------
        // 14. String Immutability
        // --------------------------------------------------

        String original = "Hello";
        String changed = original.concat(" Java");

        System.out.println("Original string: " + original);
        System.out.println("New string: " + changed);
    }
}