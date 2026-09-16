class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        quickSort(nums, 0, nums.length-1);
        int max=1,count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1])
                count++;
            else if(nums[i]==nums[i+1])
                continue;
            else{
                max=Math.max(max,count);
                count =1;
            }
        }
        return Math.max(max,count);
    }


    void quickSort(int[] ar,int l, int r){
        if(l<r){
        
        int piv= partition(ar, l, r);
        quickSort(ar, l, piv);
        quickSort(ar, piv+1, r);}
    }

    int partition(int[] ar, int l, int r){
        int p=ar[l],low=l+1,high=r;
        while(true){
            while(low<=r&&ar[low]<=p)
                low++;
            while(high>l&&ar[high]>=p)
                high--;
            if(high<low)
                break;
            int temp=ar[low];
            ar[low]=ar[high];
            ar[high]=temp;
            low++;
            high--;
            
        }
        int temp=ar[l];
            ar[l]=ar[high];
            ar[high]=temp;
        return high;
    }
}
