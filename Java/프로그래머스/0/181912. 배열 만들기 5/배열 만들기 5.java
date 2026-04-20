import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> arrayList = new ArrayList<>();
        for(String str : intStrs){
            if(Integer.parseInt(str.substring(s,s+l))>k){
                arrayList.add(Integer.parseInt(str.substring(s,s+l)));
            }
        }
        int[] answer = new int[arrayList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}