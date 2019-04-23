class Solution {
    // 穷举法
    // 时间复杂度 O(n2)
    // 空间复杂度 O(1)
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    return new int[] { i, k };
                }
            }
        }
        return null;
    }

    // 循环一次的Hash Table
    // 时间复杂度 O(n)
    // 空间复杂度 O(n)
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { i, map.get(complement) };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}