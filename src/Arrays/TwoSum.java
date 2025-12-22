package Arrays;
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Brute Force
        int res1=0,res2=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    res1=i;
                    res2=j;
                }
            }
        }
        return new int[] {res1,res2};


        //Optimal
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//
//            int complement = target - nums[i];
//
//            if (map.containsKey(complement)) {
//                return new int[]{map.get(complement), i};
//            }
//
//            map.put(nums[i], i);
//        }
//
//        return new int[]{};
    }
}

