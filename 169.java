class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int x = 0; x < nums.length; x++) {
            if (count == 0) {
                candidate = nums[x];
            }
            count += nums[x] == candidate ? 1 : -1;
        }
        return candidate;
    }
}