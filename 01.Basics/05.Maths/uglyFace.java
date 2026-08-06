public class uglyFace {
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        int[] factors = {2, 3, 5};

        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }

        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(6));
        System.out.println(isUgly(1));
        System.out.println(isUgly(14));
    }
}