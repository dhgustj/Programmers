class Solution {
    public String solution(String myString) {
        String answer = "";
        String [] array = myString.split("");
        for(String s : array){
            s = s.toLowerCase();
            answer += s;
        }
        return answer;
    }
}