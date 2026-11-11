class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int lastindex = myString.lastIndexOf(pat);
        for(int i = 0; i < lastindex + pat.length(); i++){
            answer += myString.charAt(i);
        }
        return answer;
    }
}