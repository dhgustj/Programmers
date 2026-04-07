import java.util.*;

class Solution {
    public int [] solution(int[] arr, int[] delete_list) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int num : arr) {
            arrList.add(num);
        }

        for (int num : delete_list) {
            arrList.remove((Integer)num); 
        }
        
        int[] answer = new int[arrList.size()];
        for(int i = 0; i < arrList.size(); i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}