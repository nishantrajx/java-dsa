public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int missing = nums.length;

        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }

        return missing;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        System.out.println(missingNumber(nums));
    }
}