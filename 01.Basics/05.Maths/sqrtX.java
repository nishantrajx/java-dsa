public class sqrtX {

    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int x = 8;

        System.out.println("Square Root of " + x + " = " + mySqrt(x));
    }
}