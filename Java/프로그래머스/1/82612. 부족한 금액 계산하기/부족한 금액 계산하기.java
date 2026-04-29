class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long m = 0;
        for(int i=1; i<=count; i++){
            m += (long)price*i;
        }
        if(money >= m){
            return 0;
        }else{
            answer = m-money;
        }
        return answer;
    }
}