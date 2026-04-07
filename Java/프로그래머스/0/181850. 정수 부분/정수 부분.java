class Solution {
    public int solution(double flo) {
        int answer = 0;
        String [] flo_str = String.valueOf(flo).split("\\.");
        String str = flo_str[0];
        answer = Integer.parseInt(str);
        return answer;
    }
}