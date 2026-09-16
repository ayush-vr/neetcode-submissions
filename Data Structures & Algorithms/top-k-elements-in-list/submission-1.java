class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> freq=new HashMap<>();
       List<Integer>[] bucket=new List[nums.length+1];
       for(int i=0; i<nums.length;i++)
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);

        for(Map.Entry<Integer, Integer> set:freq.entrySet()){
            if(bucket[set.getValue()]==null)
                bucket[set.getValue()]=new ArrayList<>();
            bucket[set.getValue()].add(set.getKey());
        }
        List<Integer> result =new ArrayList<>();
        for(int i=bucket.length-1;i>0&&result.size()<k;i--){
            if(bucket[i]!=null )
            {
                result.addAll(bucket[i]);
            
            }

        }
        int[] ar=new int[result.size()];int i=0;
        for(int n:result)
            ar[i++]=n;
        return ar;
    }
}
