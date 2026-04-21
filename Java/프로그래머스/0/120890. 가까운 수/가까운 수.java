import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int num = Math.abs(array[0]-n);
        
        for(int i=1; i<array.length; i++){
            int diff = Math.abs(array[i]-n);
            if(diff < num || (diff == num && array[i] < answer)){
                num = diff;
                answer = array[i];
            }
        }
        
        return answer;
    }
}