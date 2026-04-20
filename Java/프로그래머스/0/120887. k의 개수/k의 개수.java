class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String target = String.valueOf(k);
        for(int start = i; start<=j; start++){
            String str = String.valueOf(start);
            for(int l=0; l<str.length(); l++){
                if(str.charAt(l) == target.charAt(0)){
                    answer++;
                }
            }
        }
        return answer;
    }
}