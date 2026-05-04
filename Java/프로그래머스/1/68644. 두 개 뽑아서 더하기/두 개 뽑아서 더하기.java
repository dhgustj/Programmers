import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> arrayList = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(!arrayList.contains(numbers[i] + numbers[j])){
                    arrayList.add(numbers[i] + numbers[j]);
                }
            }
        }
        Collections.sort(arrayList);
        int[] answer = new int[arrayList.size()];
        for(int k=0; k<answer.length; k++){
            answer[k] = arrayList.get(k);
        }
        return answer;
    }
}