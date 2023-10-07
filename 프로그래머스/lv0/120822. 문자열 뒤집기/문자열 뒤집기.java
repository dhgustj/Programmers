class Solution {
    public String solution(String my_string) {
        char [] array = my_string.toCharArray();
        String answer = "";
        for(int i=1; i<=array.length; i++){
            answer += array[array.length-i];
        }
        return answer;
    }
}