class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=sort(strs[i]);
            if(map.containsKey(s))
                map.get(s).add(strs[i]);
            else{
                List<String> l1=new ArrayList<>();
                l1.add(strs[i]);
                map.put(s, l1);}
        }
        ArrayList<List<String>> l=new ArrayList<>();
        for(List<String> list: map.values()){
            l.add(new ArrayList<>(list));
        }
        return l;
    }
    public String sort(String s) {
    char[] arr = s.toCharArray();
    Arrays.sort(arr);
    return new String(arr);
}

}
