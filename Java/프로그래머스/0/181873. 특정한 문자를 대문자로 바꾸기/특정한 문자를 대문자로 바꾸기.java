class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String [] array = my_string.split("");
        for(String s : array){
            if(s.equals(alp)){
               s = s.toUpperCase();
            }
            answer += s;
        }
        return answer;
    }
}