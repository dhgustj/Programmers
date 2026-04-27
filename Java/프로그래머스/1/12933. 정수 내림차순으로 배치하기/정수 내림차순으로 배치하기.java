import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = String.valueOf(n).split("");
        
        Arrays.sort(str);
        String st = "";
        
        for(int i=str.length-1; i>=0; i--){
            st += str[i];
        }
        
        answer = Long.parseLong(st);
        return answer;
    }
}