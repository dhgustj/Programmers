import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int i = 0;
        int sum = 0;
        Arrays.sort(d);
        
        while(i < d.length && sum + d[i] <= budget){
            sum += d[i];
            answer++;
            i++;
        }
        
        return answer;
    }
}