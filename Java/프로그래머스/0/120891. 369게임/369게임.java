class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        for(char x : str.toCharArray()){
            if(x == '3' || x == '6' || x =='9'){
                answer++;
            }
        }
        return answer;
    }
}