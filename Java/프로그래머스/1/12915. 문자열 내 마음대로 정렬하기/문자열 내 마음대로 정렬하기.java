import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> arrayList = new ArrayList<>();
        
        for(String str : strings){
            arrayList.add(str.charAt(n) + str);
        }
        Collections.sort(arrayList);
        
        for(int i=0; i<answer.length; i++){
            answer[i] = arrayList.get(i).substring(1);
        }
        return answer;
    }
}