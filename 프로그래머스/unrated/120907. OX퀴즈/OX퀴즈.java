class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
            String[] array = quiz[i].split(" ");
            int result = Integer.valueOf(array[0]);
            for(int j=0; j<array.length; j++){
                if(j%2 !=0){
                    if(array[j].equals("+")) result += Integer.valueOf(array[j+1]);
                    else if(array[j].equals("-")) result -= Integer.valueOf(array[j+1]);
                    else if(array[j].equals("=")){
                        if(result== Integer.valueOf(array[array.length-1])) 
                            answer[i] = "O";
                        else answer[i] = "X";
                    }
                }
            }
        }
        return answer;
    }
}