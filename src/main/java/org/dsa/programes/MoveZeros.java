package org.dsa.programes;

import java.util.Arrays;

public class MoveZeros {

    static void main() {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
    public static void moveZeroes(int[] nums) {
        int i = 0, j = i+1;

        while(j < nums.length){
            if(nums[i] == 0 && nums[j] == 0){
                j++;
            }else if(nums[i] == 0 && nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }else{
                i++;
                j++;
            }
        }
        System.out.print(Arrays.toString(nums));
    }

    public void moveZeroesGPTAns(int[] nums) {
        int index = 0;

        // Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // Fill remaining positions with zero
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
