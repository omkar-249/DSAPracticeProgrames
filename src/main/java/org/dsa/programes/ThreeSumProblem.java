package org.dsa.programes;

import java.util.*;

public class ThreeSumProblem {

    static void main() {

        Map<Integer, Integer> map = new HashMap<>();
        Map<String, List<Integer>> result = new HashMap<>();

        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

        int i=0, j=nums.length-1;

        Arrays.sort(nums);

        int z = 0;
        for(int x : nums){
            map.put(x, z++);
        }

        System.out.println("Sorted array : " + Arrays.toString(nums));
        System.out.println("Map : " + map.toString());

        do{
            int temp = (nums[i] + nums[j]) * -1;

            System.out.println("i : " + i + " : j : " + j + " : sum : " + (nums[i] + nums[j])*-1);

            if(map.containsKey(temp) && map.get(temp) != i && map.get(temp) != j){

                List<Integer> tempList = Arrays.asList(nums[i], nums[j], temp);
                tempList.sort(Comparator.comparingInt(Integer::intValue));
                String key = tempList.get(0) + ":" + tempList.get(1)  + ":" + tempList.get(2);
                if(result.isEmpty() || !result.containsKey(key)) result.put(key, tempList);
            }

            if((temp*-1) < 0) i++;
            else j--;

        }while(i<j);

        System.out.println(result.values().stream().toList());
    }
}
