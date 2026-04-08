class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum_odd = 0; //홀수 합
        int sum_even = 0; //짝수 합
        for(int i=0; i<num_list.length; i++){
            if(i%2 == 0){ //홀수 번째
                sum_odd += num_list[i];
            }else{ //짝수 번째
                sum_even += num_list[i];
            }
        }
        if(sum_odd > sum_even){
            answer = sum_odd;
        }else if(sum_odd < sum_even){
            answer = sum_even;
        }else{
            answer = sum_odd;
        }
        return answer;
    }
}