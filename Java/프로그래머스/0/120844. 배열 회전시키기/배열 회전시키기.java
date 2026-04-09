class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")){
            for(int i=0; i<numbers.length; i++){
                if(i == numbers.length-1){
                    answer[0] = numbers[i];
                }else{
                    answer[i+1] = numbers[i];
                }
            }
        }else if(direction.equals("left")){
            for(int j=0; j<numbers.length; j++){
                if(j == 0){
                    answer[numbers.length-1] = numbers[j];
                }else{
                    answer[j-1] = numbers[j];
                }
            }
        }
        return answer;
    }
}