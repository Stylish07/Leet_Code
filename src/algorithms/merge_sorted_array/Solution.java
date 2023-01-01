package algorithms.merge_sorted_array;

import java.util.Arrays;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }

}
