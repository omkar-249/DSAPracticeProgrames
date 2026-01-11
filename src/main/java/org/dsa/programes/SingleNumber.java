package org.dsa.programes;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    static void main() {
//        int[] nums = new int[]{4,1,2,1,2};
        int[] nums = new int[]{2,1,2};
        int temp = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) set.remove(i);
            else set.add(i);

            temp = temp ^ i;
            System.out.println(temp);
        }
        System.out.print(set.stream().findFirst().orElse(0).intValue());
    }
}
