import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> arrayList = new ArrayList<>();
        
        if(n == 1){
            for(int i=0; i<=slicer[1]; i++){
                arrayList.add(num_list[i]);
            }
        }else if(n == 2){
            for(int i=slicer[0]; i<num_list.length; i++){
                arrayList.add(num_list[i]);
            }
        }else if(n == 3){
            for(int i=slicer[0]; i<=slicer[1]; i++){
                arrayList.add(num_list[i]);
            }
        }else{
            for(int i=slicer[0]; i<=slicer[1]; i += slicer[2]){
                arrayList.add(num_list[i]);
            }
        }
        int[] answer = new int[arrayList.size()];
        for(int j=0; j<answer.length; j++){
            answer[j] = arrayList.get(j);
        }
        return answer;
    }
}