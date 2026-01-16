package org.dsa.programes;

public class RemoreDuplicatesFromSortedArray {

    static void main() {
       removeDuplicates(new int[]{1,1,2,3,3,4,5,6,6,6,7});
    }
        public static int removeDuplicates(int[] nums) {
            int index = 0, preNum = 0;

            for(int i = 0; i<nums.length; i++){
                if(i == 0 || nums[i] != preNum){
                    preNum = nums[i];
                    nums[index++] = nums[i];
                }
            }
            for(int i=0;i<index;i++)System.out.println(nums[i]);
            return index;
        }
}
