import java.lang.Math;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int small = Math.min(sides[0],sides[1]);
        int big = Math.max(sides[0],sides[1]);
        
        int lowlimit = big-small;
        int highlimit = big+small;
        answer = highlimit-lowlimit-1;
        return answer;
    }
}