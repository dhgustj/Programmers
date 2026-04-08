import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String [] string = myString.split("x");
        List<String> arrayList = new ArrayList<>();
        
        for(String s : string){
            if(!s.equals("")){
                arrayList.add(s);
            }
        }
        Collections.sort(arrayList);
        
        String[] answer = arrayList.toArray(new String[arrayList.size()]);
        return answer;
    }
}