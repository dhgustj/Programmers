import java.util.*;

class Solution {
    public String solution(String s) {
        Character[] array = new Character[s.length()];
        
        for(int i=0; i<array.length; i++){
            array[i] = s.charAt(i);
        }
        Arrays.sort(array, Comparator.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(char c : array){
            sb.append(c);
        }
        return sb.toString();
    }
}