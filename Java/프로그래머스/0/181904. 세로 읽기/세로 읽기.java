class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String [][] str = new String[my_string.length() / m][m];
        int index = 0;
        for(int i=0; i<str.length; i++){
            for(int j=0; j<str[i].length; j++){
                str[i][j] = String.valueOf(my_string.charAt(index++));
            }
        }
        for(int k=0; k<str.length; k++){
            answer += str[k][c-1];
        }
        return answer;
    }
}