import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0; i<photo.length; i++){
            List<String> list = new ArrayList<>(Arrays.asList(photo[i]));
            int sum = 0;
            for(int j=0; j<name.length; j++){
                if(list.contains(name[j])){
                    sum += yearning[j];
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}