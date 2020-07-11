class Solution {
    public int singleNumber(int[] nums) {
        for (int x = 1; x < nums.length; x++) {
            nums[0] ^= nums[x];
        }
        return nums[0];
    }
}