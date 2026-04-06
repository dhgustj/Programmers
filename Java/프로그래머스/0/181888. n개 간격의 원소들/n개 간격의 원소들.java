class Solution {
    public int[] solution(int[] num_list, int n) {
        int l = (num_list.length + n - 1) / n;
        
        int[] answer = new int[l];
        int j = 0;
        for(int i=0; i<answer.length; i++){
            answer[i] = num_list[j];
            j += n;
        }
        return answer;
    }
}