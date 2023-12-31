import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] array = my_string.toCharArray();
        Arrays.sort(array);
        String answer = new String(array);
        return answer;
    }
}