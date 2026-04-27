class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int big = 0;
        int small = 0;
        
        if(a>b){
            big = a;
            small = b;
        }else{
            big = b;
            small = a;
        }
        
        for(int i=small; i<=big; i++){
            answer += Long.valueOf(i);
        }
        return answer;
    }
}