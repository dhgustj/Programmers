class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length(); 
        for(int i=0; i<=t.length()-length; i++){
            if(Long.parseLong(t.substring(i,i+length)) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}