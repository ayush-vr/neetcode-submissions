class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            int req= target-nums[i];
            if(ls.contains(req))
                return new int[]{ls.indexOf(req),i};
            else
                ls.add(nums[i]);
        }
        return new int[]{-1,-1};
        
    }
}
