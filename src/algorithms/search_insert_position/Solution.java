package algorithms.search_insert_position;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {

			if (target == nums[i]) {
				return i;
			}
			
			if (target < nums[i]) {
				return 0;
			}

			if (i + 1 == nums.length) {
				return i + 1;
			}

			if (target < nums[i + 1]) {
				return i + 1;
			}

		}

		return 0;
	}
}
