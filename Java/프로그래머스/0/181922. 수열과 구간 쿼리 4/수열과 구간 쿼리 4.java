class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int[] query : queries){
            int start = query[0];
            int end = query[1];
            for(int i=start; i<=end; i++){
                if(i % query[2] == 0){
                    arr[i] += 1;
                }
            }
        }
        for(int j=0; j<answer.length; j++){
            answer[j] = arr[j];
        }
        return answer;
    }
}