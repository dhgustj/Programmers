class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].contains(ex)){
                str_list[i] = " ";
            }
        }
        for(int j=0; j<str_list.length; j++){
            if(!str_list[j].equals(" ")){
                answer += str_list[j];
            }
        }
        return answer;
    }
}