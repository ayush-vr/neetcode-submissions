class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        ArrayList<Character> ls=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            ls.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(ls.contains(t.charAt(i)))
                ls.remove(Character.valueOf(t.charAt(i)));
            else 
                return false;
        }
        return true;

    }
}
