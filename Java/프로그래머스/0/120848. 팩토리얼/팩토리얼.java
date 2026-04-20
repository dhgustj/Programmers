class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        int j = 1;
        while(j<=n){
            i++;
            j *= i;
        }
        answer = i-1;
        return answer;
    }
}