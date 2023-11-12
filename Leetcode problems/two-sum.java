import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num_map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (num_map.containsKey(target - nums[i])) {
                int[] res = new int[2];
                res[0] = i;
                res[1] = num_map.get(target - nums[i]);
                return res;
            }
            
            num_map.put(nums[i], i);
        }
        return new int[]{};
    }
}

 
 
