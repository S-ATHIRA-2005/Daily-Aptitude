public class MissingAndRepeated {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4, 5};

        int n = nums.length;

        int[] count = new int[n + 1];
        for (int num : nums) {
            count[num]++;
        }

        int missing = -1;
        int repeated = -1;

        // Find missing and repeated
        for (int i = 1; i <= n; i++) {

            if (count[i] == 0) {
                missing = i;
            }

            if (count[i] == 2) {
                repeated = i;
            }
        }

        System.out.println("Missing Number = " + missing);
        System.out.println("Repeated Number = " + repeated);
    }
}
