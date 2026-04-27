class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();

        int num_p = 0;
        int num_y = 0;
        
        for(String st : s.split("")){
            if(st.equals("p")){
                num_p++;
            }else if(st.equals("y")){
                num_y++;
            }
        }
        
        if(num_p == num_y){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}