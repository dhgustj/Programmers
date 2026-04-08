import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                arrList.add(arr[i]);
            }
        }
        int[] answer = new int[arrList.size()];
        for(int k=0; k<answer.length; k++){
            answer[k] = arrList.get(k);
        }
        return answer;
    }
}