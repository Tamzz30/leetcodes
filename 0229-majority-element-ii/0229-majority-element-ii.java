class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int limit = nums.length / 3;

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > limit) {
                ans.add(key);
            }
        }

        return ans;
    }
}