package org.dsa.programes;

import java.util.Arrays;
import java.util.logging.Logger;

public class MergeSortedArrays {
    //Logger log = new Logger(MergeSortedArrays.this);
    static void main() {
//        merge(new int[]{0,0,3,0,0,0,0,0,0}, 3,new int[]{-1,1,1,1,2,3}, 6);
//        merge(new int[]{1,2,3,0,0,0}, 3,new int[]{2,5,6}, 3);
        merge(new int[]{-1,0,0,3,3,3,0,0,0}, 6,new int[]{1,2,2}, 3);
    }

        public static void merge(int[] nums1, int m, int[] nums2, int n) {

            int i = m-1;
            int j = n-1;
            int ptr = m + n -1;

            while(j >= 0){
                if(i >= 0 && nums1[i] > nums2[j]){
                    nums1[ptr--] = nums1[i--];
//                    nums1[i--] = 0;
                }else{
                    nums1[ptr--] = nums2[j--];
                }
            }
            System.out.println(Arrays.toString(nums1));
        }

}
