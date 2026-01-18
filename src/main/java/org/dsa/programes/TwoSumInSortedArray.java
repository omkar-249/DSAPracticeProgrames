package org.dsa.programes;

import java.util.Arrays;

public class TwoSumInSortedArray {

    static void main() {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    }
        public static int[] twoSum(int[] numbers, int target) {

            int i = 0, j = numbers.length-1, temp;

            while(i < j){

                temp = numbers[i] + numbers[j];
                if(temp > target){
                    j--;
                }else if(temp < target){
                    i++;
                }else{
                    return new int[]{i+1, j+1};
                }
            }
            throw new IllegalArgumentException("No solution exists");

        }
}
