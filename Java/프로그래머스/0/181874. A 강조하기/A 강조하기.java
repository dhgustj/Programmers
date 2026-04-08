class Solution {
    public String solution(String myString) {
        String answer = "";
        String [] array = myString.split("");
        for(String s : array){
            if(s.equals("a") || s.equals("A")){
                s = s.toUpperCase();
            }else if(s.equals(" ")){
                s = " ";
            }else{
                s = s.toLowerCase();
            }
            answer += s;
        }
        return answer;
    }
}