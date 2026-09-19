class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] n= new int[nums.length];
        int pro=1,flag=2;
        for(int i: nums)
        {
            if(i==0)
            {
                flag--;
                continue;
            }
            pro=pro*i;
        }
        
        for(int i=0;i<n.length; i++){
            if(flag==1){
                if(nums[i]==0)      
                    n[i]=pro;
            }
            else if(flag<=0)
                n[i]=0;
            else 
                n[i]=pro/nums[i];
        }
        return n;
    }
}  
