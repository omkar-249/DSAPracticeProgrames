package org.dsa.programes;

import java.util.Arrays;

public class PlusOne {

    static void main() {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
    }
    public static int[] plusOne(int[] digits) {

        return getResponseArray(digits, digits.length-1);
    }

    private static int[] getResponseArray(int[] digits, int k){
        if(digits[k] <= 8 && k >= 0){
            digits[k] = digits[k]+1;
            return digits;
        }else if(digits[k] == 9 && k >= 1){
            digits[k] = 0;
            return getResponseArray(digits, --k);
        }else if(digits[k] == 9 && k == 0){
            int[] res = new int[digits.length+1];
            System.arraycopy(digits, 0, res, 1, digits.length);
            return getResponseArray(res, ++k);
        }
        return digits;
    }

    public int[] plusOneGptAns(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If we reach here, all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
