class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String [] str = myString.split("");
        String string = "";
        for(int i=0; i<str.length; i++){
            if(str[i].equals("A")){
                str[i] = "B";
            }else{
                str[i] = "A";
            }
            string += str[i];
        }
        if(string.contains(pat)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}