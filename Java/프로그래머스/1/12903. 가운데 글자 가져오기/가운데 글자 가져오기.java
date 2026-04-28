class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0){
            answer += String.valueOf(s.charAt(s.length() / 2 - 1));
            answer += String.valueOf(s.charAt(s.length() / 2));
        }else{
            int a = s.length() / 2;
            answer += String.valueOf(s.charAt(a));
        }
        return answer;
    }
}