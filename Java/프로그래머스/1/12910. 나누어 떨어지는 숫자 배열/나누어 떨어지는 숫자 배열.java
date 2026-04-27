import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> arrayList = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                arrayList.add(arr[i]);
            }
        }
        Collections.sort(arrayList);
        
        if(arrayList.isEmpty()){
            return new int[]{-1};
        }
        
        int[] answer = new int[arrayList.size()];
        
        for(int j=0; j<answer.length; j++){
            answer[j] = arrayList.get(j);
        }
        return answer;
    }
}