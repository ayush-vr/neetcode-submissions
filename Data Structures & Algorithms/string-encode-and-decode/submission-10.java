class Solution {

    public String encode(List<String> strs) {
        StringBuilder str= new StringBuilder();
        for(String s: strs){
            str.append(s).append("~!@#$");
        }
        //System.out.println(str.toString());
        return str.toString();

    }

    public List<String> decode(String str) {
        ArrayList<String> s=new ArrayList<>();
        int c=0;        
        for(int i=0;i<str.length(); i++)
        {
            
            if(i+5<=str.length()&&str.substring(i,i+5).equals("~!@#$"))
            {
                System.out.println(str.substring(c,i));
                s.add(str.substring(c,i));
                c=i+5;
                
                
            }

        }
        return s;

    }
}
