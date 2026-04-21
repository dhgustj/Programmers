import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] str = myStr.split("a|b|c"); 
        List<String> arrayList = new ArrayList<>();
        for(String s : str){
            if(!s.isEmpty()){
                arrayList.add(s);
            }
        }
        if(arrayList.size() == 0){
            return new String[]{"EMPTY"};
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }
}