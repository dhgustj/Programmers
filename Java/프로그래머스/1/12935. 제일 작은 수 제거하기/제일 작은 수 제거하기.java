import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }
        
        List<Integer> arrayList = new ArrayList<>();
        int min = arr[0];
        
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        for(int j=0; j<arr.length; j++){
            if(arr[j] != min){
                arrayList.add(arr[j]);
            }
        }
        
        int[] answer = new int[arrayList.size()];
        for(int k=0; k<answer.length; k++){
            answer[k] = arrayList.get(k);
        }
        return answer;
    }
}