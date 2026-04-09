import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> arrayList = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++){
            arrayList.add(my_string.substring(i,my_string.length()));
        }
        Collections.sort(arrayList);
        return arrayList.toArray(new String[arrayList.size()]);
    }
}