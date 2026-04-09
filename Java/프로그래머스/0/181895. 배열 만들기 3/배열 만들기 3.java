import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> arrayList = new ArrayList<>();
        
        for(int i = intervals[0][0]; i<=intervals[0][1]; i++){
            arrayList.add(arr[i]);
        }
        for(int j= intervals[1][0]; j<=intervals[1][1]; j++){
            arrayList.add(arr[j]);
        }
        
        int[] answer = new int[arrayList.size()];
        for(int k=0; k<answer.length; k++){
            answer[k] = arrayList.get(k);
        }
        return answer;
    }
}