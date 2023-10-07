class Solution {
    public String solution(String my_string, int n) {
        char [] array = my_string.toCharArray();
        String answer = "";
        for(int i=0; i<array.length; i++){
            for(int j=0; j<n; j++){
                answer += array[i];
            }
        }
        return answer;
    }
}