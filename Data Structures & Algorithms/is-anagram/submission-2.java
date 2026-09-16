class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ar1=new int[26];
        int[] ar2=new int[26];
        ar1=calc(s);
        ar2=calc(t);
        if(Arrays.equals(ar1, ar2))
            return true;
        else 
            return false;
    }

    public int[] calc(String s){
        int[] ar=new int[26];
        for(int i=0;i< s.length();i++){
            ar[s.charAt(i)-'a']++;
        }
        return ar;
    }
}
