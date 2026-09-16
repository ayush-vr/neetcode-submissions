class Solution {

    public String encode(List<String> strs) {
        StringBuilder s=new StringBuilder();
        for(String ss:strs)
        {
            s.append(ss+"(lund)");
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        int j=0,i;
        for( i=0 ;i< str.length();i++){
            if((i+6)<=str.length()&&str.substring(i,i+6).equals("(lund)"))
                { 
                    String c=str.substring(j,i);
                    res.add(c);
                    j=i+6;
                }  
        }
        return res;
    }
}
