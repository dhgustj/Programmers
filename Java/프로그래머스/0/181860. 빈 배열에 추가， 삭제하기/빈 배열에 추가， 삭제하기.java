import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<flag.length; i++){
            if(flag[i] == true){
                for(int j=0; j<arr[i]*2; j++){
                    arrayList.add(arr[i]);
                }
            }else if(flag[i] == false){
                for (int j = 0; j < arr[i]; j++) {
                    if (!arrayList.isEmpty()) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
        }
        int[] answer = new int[arrayList.size()];
        for(int l=0; l<answer.length; l++){
            answer[l] = arrayList.get(l);
        }
        return answer;
    }
}