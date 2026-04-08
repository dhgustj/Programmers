class Solution {
    public int[] solution(String myString) {
        String [] array = myString.split("x", -1);
        int[] answer = new int[array.length];
        
        for(int i=0; i<array.length; i++){
            if(array[i].equals(" ")){
                answer[i] = 0;
            }else{
                answer[i] = array[i].length();
            }
        }
        return answer;
    }
}