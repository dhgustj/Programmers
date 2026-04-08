class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String [] str = binomial.split(" ");
        if(binomial.contains("+")){
            answer =  Integer.parseInt(str[0]) +  Integer.parseInt(str[2]);
        }else if(binomial.contains("-")){
            answer =  Integer.parseInt(str[0]) -  Integer.parseInt(str[2]);
        }else if(binomial.contains("*")){
            answer =  Integer.parseInt(str[0]) *  Integer.parseInt(str[2]);
        }
        return answer;
    }
}