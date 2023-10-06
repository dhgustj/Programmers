import java.util.*;
class Solution {
    public int solution(int[] array) {
        int maxcount = 0;
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int number : array){ //[1,2,3,3,3,4]를 key로 지정
            int count = map.getOrDefault(number,0)+1;
            if(count > maxcount){
                maxcount = count;
                answer = number;
            }
            else if(count == maxcount){
                answer = -1;
            }
            map.put(number,count);
        }
        return answer;
    }
}