class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i : array){
            String s = String.valueOf(i);
            for(String st : s.split("")){
                if(st.equals("7")){
                    answer++;
                }
            }
        }
        return answer;
    }
}