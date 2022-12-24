package algorithms.sqrtx;

public class Solution {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        double length = Integer.toString(x).length() / 2.0;
        int small = 1;
        int large;

        for (int i = 0; i < length - 1; i++) {
            small *= 10;
        }
        large = small * 10;
        long everage = (small + large) / 2;

        while (large - small != 1) {
            if (everage * everage <= x) {
                small = (int) everage;
            }
            if (everage * everage > x) {
                large = (int) everage;
            }
            everage = (small + large) / 2;
        }

        return small;
    }

}
