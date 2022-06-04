package algorithms.remove_element;

class Solution {
    public int removeElement(int[] nums, int val) {
        int[] removedNums = new int[nums.length];
        int curr = 0;

        for (int num : nums) {
            if (num != val) {
                removedNums[curr] = num;
                curr++;
            }
        }

        System.arraycopy(removedNums, 0, nums, 0, curr);

        return curr;
    }
}
