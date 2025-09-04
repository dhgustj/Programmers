import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int central = array.length/2;
        Arrays.sort(array);
        answer = array[central];
        return answer;
    }
}