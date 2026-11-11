class Solution {
    public String solution(String my_string, int s, int e) {
        String str = my_string.substring(s,e+1);
        
        StringBuilder sb1 = new StringBuilder(str);
        String reverse = sb1.reverse().toString();
        
        StringBuilder sb2 = new StringBuilder(my_string);
        String answer = sb2.replace(s,e+1,reverse).toString();
        
        return answer;
    }
}