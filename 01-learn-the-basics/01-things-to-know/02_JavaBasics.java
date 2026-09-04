/*
 * A2Z DSA — #2 Java Basics
 *
 * Purpose:
 * Revision of fundamental Java language concepts before starting DSA.
 *
 * Topics:
 * - Variables
 * - Primitive data types
 * - Reference types
 * - Type casting
 * - Constants
 * - Arithmetic operators
 * - Relational operators
 * - Logical operators
 * - Increment / decrement
 * - String basics
 * - Arrays basics
 *
 * Language: Java
 */

class JavaBasics {

    public static void main(String[] args) {

        // --------------------------------------------------
        // 1. Variables and Primitive Data Types
        // --------------------------------------------------

        int age = 21;
        long population = 8_000_000_000L;
        float percentage = 85.5f;
        double salary = 75000.50;
        char grade = 'A';
        boolean isStudent = true;

        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Percentage: " + percentage);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);


        // --------------------------------------------------
        // 2. Constants
        // --------------------------------------------------

        final double PI = 3.14159265359;

        System.out.println("PI: " + PI);


        // --------------------------------------------------
        // 3. Arithmetic Operators
        // --------------------------------------------------

        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));


        // --------------------------------------------------
        // 4. Relational Operators
        // --------------------------------------------------

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));


        // --------------------------------------------------
        // 5. Logical Operators
        // --------------------------------------------------

        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));


        // --------------------------------------------------
        // 6. Increment and Decrement
        // --------------------------------------------------

        int count = 5;

        count++;
        System.out.println("After increment: " + count);

        count--;
        System.out.println("After decrement: " + count);


        // --------------------------------------------------
        // 7. Type Casting
        // --------------------------------------------------

        double decimalValue = 25.75;
        int integerValue = (int) decimalValue;

        System.out.println("Original: " + decimalValue);
        System.out.println("After narrowing: " + integerValue);

        int number = 10;
        double convertedNumber = number;

        System.out.println("Widening conversion: " + convertedNumber);


        // --------------------------------------------------
        // 8. String Basics
        // --------------------------------------------------

        String name = "NewTon";

        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("First character: " + name.charAt(0));


        // --------------------------------------------------
        // 9. Array Basics
        // --------------------------------------------------

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Array length: " + numbers.length);

        System.out.println("Array elements:");

        for (int numberInArray : numbers) {
            System.out.println(numberInArray);
        }
    }
}