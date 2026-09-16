class Solution {
    public boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        s=s.toUpperCase();
        while(i<j){
            while(i<s.length()&&check(s,i))
                i++;
            while(j>=0&&check(s,j))
                j--;
            if(i>=j)
                break;
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
    
    boolean check(String s, int n){
        int a=(int) s.charAt(n);
        if(65<=a&&a<=90){
            System.out.println(s.charAt(n)+"  sahi hai");
            return false;}
        else if(48<=a&&a<=57){
             System.out.println(s.charAt(n)+"  sahi hai");
            return false;}
        return true;
    }
}
