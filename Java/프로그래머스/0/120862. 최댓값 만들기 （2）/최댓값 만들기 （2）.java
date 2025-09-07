import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int ans1 = numbers[0] * numbers[1];
        int ans2 = numbers[numbers.length-2] * numbers[numbers.length-1];
        if(ans1 > ans2) {answer = ans1;}
        else if(ans1 < ans2) {answer = ans2;}
        else { answer = ans1;}
        return answer;
    }
}