
class Solution {
    public int missingInteger(int[] nums) {

        // 1. Find the sum of the longest sequential prefix
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // 2. Mark all numbers present in nums
        boolean[] present = new boolean[101];

        for (int num : nums) {
            present[num] = true;
        }

        // 3. Find the smallest missing number >= sum
        while (sum < present.length && present[sum]) {
            sum++;
        }

        return sum;
    }
}
