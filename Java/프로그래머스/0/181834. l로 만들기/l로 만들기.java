class Solution {
    public String solution(String myString) {
        String answer = "";
        for(char x : myString.toCharArray()){
            if(x < 'l'){
                x = 'l';
            }
            answer = answer + String.valueOf(x);
        }
        return answer;
    }
}