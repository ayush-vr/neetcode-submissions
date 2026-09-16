public class Solution {

    public String encode(List<String> strs) {
        StringBuilder s=new StringBuilder();
        for(String str:strs){
            s.append("#").append(str.length()).append("#").append(str);
        }
        return s.toString();
    }

public List<String> decode(String str) {
    List<String> ls = new ArrayList<>();
    int i = 0;
    while (i < str.length()) {
        if (str.charAt(i) == '#') {
            int temp = i + 1;
            while (temp < str.length() && str.charAt(temp) != '#') {
                temp++;
            }
            int len = Integer.parseInt(str.substring(i + 1, temp));
            int start = temp + 1;
            ls.add(str.substring(start, start + len));
            i = start + len;
        } else {
            i++;
        }
    }
    return ls;
}
}