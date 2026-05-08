class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] array = new int[number];
        
        for(int i=1; i<=number; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            array[i-1] = count;
        }
        
        for(int k=0; k<array.length; k++){
            if(array[k] <= limit){
                answer += array[k];
            }else{
                answer += power;
            }
        }
        return answer;
    }
}