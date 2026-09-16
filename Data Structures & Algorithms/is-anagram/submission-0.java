class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] lis=s.toCharArray();
        Arrays.sort(lis);
        s=new String(lis);

        lis=t.toCharArray();
        Arrays.sort(lis);
        t=new String(lis);

        System.out.print(s+" "+t);
        if(s.equals(t))
            return true;
        else
            return false;
    }
}
