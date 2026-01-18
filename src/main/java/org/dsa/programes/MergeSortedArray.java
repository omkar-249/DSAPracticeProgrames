package org.dsa.programes;

import java.util.Arrays;

public class MergeSortedArray {

    static void main() {
//        merge(new int[]{0,0,3,0,0,0,0,0,0}, 3,new int[]{-1,1,1,1,2,3}, 6);
//        merge(new int[]{1,2,3,0,0,0}, 3,new int[]{2,5,6}, 3);
        merge(new int[]{-1,0,0,3,3,3,0,0,0}, 6,new int[]{1,2,2}, 3);

        int[] nums1 = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] nums2 = new int[]{-50,-50,-48,-47,-44,-44,-37,-35,-35,-32,-32,-31,-29,-29,-28,-26,-24,-23,-23,-21,-20,-19,-17,-15,-14,-12,-12,-11,-10,-9,-8,-5,-2,-2,1,1,3,4,4,7,7,7,9,10,11,12,14,16,17,18,21,21,24,31,33,34,35,36,41,41,46,48,48};
        merge(nums1, 0,nums2, 63);
    }
        public static void merge(int[] nums1, int m, int[] nums2, int n) {

            int i = m-1, j = nums2.length-1, index = m+n-1;
            try {
                while (j >= 0) {
                    if (i < 0 || nums2[j] > nums1[i]) {
                        nums1[index--] = nums2[j--];
                    } else {
                        nums1[index--] = nums1[i--];
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception : i " + i + " : j : " + j + " : index : " + index);
            }
            System.out.println(Arrays.toString(nums1));
        }
}
