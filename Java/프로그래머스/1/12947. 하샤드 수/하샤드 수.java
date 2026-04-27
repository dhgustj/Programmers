class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String str = String.valueOf(x);
        
        for(String s : str.split("")){
            sum += Integer.parseInt(s);
        }
        
        if(x % sum == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}