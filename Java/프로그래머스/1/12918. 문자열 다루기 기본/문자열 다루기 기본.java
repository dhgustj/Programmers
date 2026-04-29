class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if((s.length()==6 || s.length()==4) && s.matches("\\d+")){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}