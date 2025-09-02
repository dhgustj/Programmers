import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int max = sides[2];
        int sum = sides[0] + sides[1];
        if(max < sum){
            answer = 1;
        }else{
            answer = 2;
        }

        return answer;
    }
}