/**
 * A2Z DSA - #6 For Loop
 *
 * Given two integers low and high,
 * return the sum of all integers from low to high inclusive.
 *
 * Example:
 * low = 3, high = 8
 * Output = 33
 */
class ForLoop {

    /**
     * Returns the sum of all integers from low to high.
     */
    public int forLoop(int low, int high) {

        int sum = 0;

        for (int i = low; i <= high; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        ForLoop solution = new ForLoop();

        // Example 1
        System.out.println(solution.forLoop(1, 5)); // 15

        // Example 2
        System.out.println(solution.forLoop(3, 7)); // 25

        // Quiz example
        System.out.println(solution.forLoop(3, 8)); // 33

        // Boundary case
        System.out.println(solution.forLoop(5, 5)); // 5

        // low = 0
        System.out.println(solution.forLoop(0, 3)); // 6
    }
}