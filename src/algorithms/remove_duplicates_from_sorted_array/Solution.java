package algorithms.remove_duplicates_from_sorted_array;

class Solution {
    public int removeDuplicates(int[] nums) {
        int[] deduplicateNum = new int[nums.length];
        deduplicateNum[0] = nums[0];
        int curr = 0;

        for (int num : nums) {
            if (num != deduplicateNum[curr]) {
                curr++;
                deduplicateNum[curr] = num;
            }
        }
        curr++;

        System.arraycopy(deduplicateNum, 0, nums, 0, curr);

        return curr;
    }
}
