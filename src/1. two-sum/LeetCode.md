## LeetCode Solution
class Solution { 
    // TC = O(n) -> scalable & SC = O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        //HashMap doesn't assumes +ve numbers only
        for(int i=0; i<nums.length; i++){
            int cur = nums[i];
            // cur + x = target -> x = target-cur
            int x = target - cur;
            if(map.containsKey(x)) return new int[] {map.get(x), i};
            map.put(cur,i); //return first valid if 1+ ans
        }
        return new int[]{}; 
        //better than return null -> Avoid NullPointerException
    }
}
