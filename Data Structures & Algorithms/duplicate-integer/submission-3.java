class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
           if(ls.contains(nums[i]))
            return true;
    
            ls.add(nums[i]);  

        }
        return false;
        
    }
}