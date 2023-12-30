import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        List<Integer> k = new ArrayList<>();
        Arrays.sort(array);
        for (int i=0; i<array.length; i++){
            k.add(Math.abs(array[i]-n));
        }
        int min = k.get(0);
        int index =0;
        for (int j=0; j<k.size(); j++){
            if(k.get(j)<min){
                min = k.get(j);
                index = j;
            }
        }
        answer = array[index];
        return answer;
    }
}