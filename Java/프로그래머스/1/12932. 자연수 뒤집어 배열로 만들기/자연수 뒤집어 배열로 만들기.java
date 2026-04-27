class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        int j=0;
        for(int i=answer.length-1; i>=0; i--){
            answer[j] = Integer.parseInt(String.valueOf(str.charAt(i)));
            j++;
        }
        return answer;
    }
}