// Problem: https://leetcode.com/problems/majority-element-ii/


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        if (nums.length < 2)
            return Arrays.stream(nums).boxed().toList();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > (nums.length/3))
                list.add(entry.getKey());
        }

        return list;
    }
}