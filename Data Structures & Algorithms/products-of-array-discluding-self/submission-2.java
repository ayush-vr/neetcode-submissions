class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1,flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                flag++;
                continue;
            }
            prod=prod*nums[i];
        }
        if(flag==1&&nums.length==1)
            return new int[]{0};
        for(int i=0;i<nums.length;i++){
            if(flag>=2){
                nums[i]=0;
            }
             else if(flag==1){
                if(nums[i]==0)
                    nums[i]=prod;
                else
                    nums[i]=0;
            }
            else
                nums[i]=prod/nums[i];
        }
        return nums;
    }
}  
