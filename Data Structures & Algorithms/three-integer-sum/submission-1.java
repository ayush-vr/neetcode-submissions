class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> ts=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1])
                continue;
            int low=i+1, high=nums.length-1;
        
            while(low<high){
                if(nums[low]==nums[low-1]&& low>i+1){
                    low++;
                    System.out.print(nums[low]);
                    continue;
                }
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0){
                    List<Integer> ls=new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[low]);
                    ls.add(nums[high]);
                    ts.add(ls);
                    low++;
                    high--;
                }
                else if(sum>0)
                    high--;

                else
                    low++;
                
            }
        }
        return ts;
    }
}
