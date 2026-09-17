class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int cur=nums[i];
            int req=target- cur;
            if(map.containsKey(req))
             return new int[]{map.get(req),i};
            else
                map.put(cur,i);
        }
        return new int[]{-1,-1};
    }
}
