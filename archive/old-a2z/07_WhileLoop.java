/**
 * A2Z DSA - #7 While Loop
 *
 * Given a digit d (0 to 9), find the sum of the first
 * 50 positive integers that end with digit d.
 *
 * Example:
 * d = 2
 * Numbers = 2, 12, 22, ..., 492
 * Output = 12350
 */
class WhileLoop {

    /**
     * Returns the sum of the first 50 positive integers
     * ending with digit d.
     */
    public int whileLoop(int d) {

        int sum = 0;
        int number = d;
        int count = 0;

        while (count < 50) {
            sum += number;
            number += 10;
            count++;
        }

        return sum;
    }

    public static void main(String[] args) {

        WhileLoop solution = new WhileLoop();

        // Example 1
        System.out.println(solution.whileLoop(1)); // 12300

        // Example 2
        System.out.println(solution.whileLoop(5)); // 12500

        // Quiz example
        System.out.println(solution.whileLoop(2)); // 12350

        // Boundary digit
        System.out.println(solution.whileLoop(0)); // 12250

        // Boundary digit
        System.out.println(solution.whileLoop(9)); // 12700
    }
}