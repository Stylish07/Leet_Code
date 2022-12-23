package algorithms.plus_one;

import java.util.Arrays;

public class Solution {

    public int[] plusOne(int[] digits) {
        int[] tempDigits = Arrays.copyOf(digits, digits.length + 1);

        for (int i = tempDigits.length - 1; i > 0; i--) {
            tempDigits[i] = tempDigits[i - 1];
        }
        tempDigits[0] = 0;
        
        tempDigits[tempDigits.length - 1] += 1;

        for (int i = tempDigits.length - 1; i >= 0; i--) {
            if (tempDigits[i] >= 10) {
                tempDigits[i] -= 10;
                tempDigits[i - 1] += 1;
            }
        }

        if (tempDigits[0] == 0) {
            return Arrays.copyOfRange(tempDigits, 1, tempDigits.length);
        }

        return tempDigits;
    }

}
