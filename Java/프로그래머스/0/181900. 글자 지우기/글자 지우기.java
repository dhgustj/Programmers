class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String [] str = my_string.split("");
        for(int i=0; i<str.length; i++){
            for(int j=0; j<indices.length; j++){
                if(i == indices[j]){
                    str[i] = " ";
                    break;
                }
            }
        }
        for(int k=0; k<str.length; k++){
            if(!str[k].equals(" ")){
                answer += str[k];
            }
        }
        return answer;
    }
}