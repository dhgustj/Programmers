class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] ave = new double[score.length];
        for(int i=0; i<score.length; i++){
            ave[i] = (score[i][0]+score[i][1]) /2.0;
        }
        for(int i=0; i<score.length; i++){
            int order = 1;
            for(int j=0; j<score.length; j++){
                if(ave[i] < ave[j]) order++;
                answer[i] = order;
            }
        }
        return answer;
    }
}