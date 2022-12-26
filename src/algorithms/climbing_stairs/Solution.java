package algorithms.climbing_stairs;

public class Solution {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] ways = new int[45];
        ways[0] = 1;
        ways[1] = 2;

        for (int i = 2; i < ways.length; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }

        return ways[n - 2] + ways[n - 3];
    }

}
