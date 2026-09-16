class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Integer,ArrayList<String>> map= new HashMap<>();
        for(int i=0;i<strs.length; i++){
            int count= convert(strs[i]);
            if(!map.containsKey(count))
                map.put(count,new ArrayList<>());
             map.get(count).add(strs[i]);
        }
        List<List<String>> list=new ArrayList<>(map.values());
        return list;

    }
    public int convert(String s){
        int[] a=new int[26];
        for(int i=0; i< s.length(); i++){
            int num=(int)s.charAt(i)-97;
            //System.out.println((int)s.charAt(i)+" "+num);
            a[num]++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            count=count*10+a[i];
        }
        return count;
    }
}
