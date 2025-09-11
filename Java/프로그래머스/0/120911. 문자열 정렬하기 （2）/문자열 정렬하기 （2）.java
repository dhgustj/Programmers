import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] array = new char[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            if(Character.isUpperCase(my_string.charAt(i))){
                array[i] = Character.toLowerCase(my_string.charAt(i));
            }else{
                array[i] = my_string.charAt(i);
            }
        }
        Arrays.sort(array);
        answer = String.valueOf(array);
        return answer;
    }
}