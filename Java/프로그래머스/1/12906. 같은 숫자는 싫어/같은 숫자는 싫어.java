import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] != arr[i]){
                arrayList.add(arr[i]);
            }
        }
        int[] answer = new int[arrayList.size()];
        for(int j=0; j<answer.length; j++){
            answer[j] = arrayList.get(j);
        }
        return answer;
    }
}