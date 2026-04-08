import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> arrayList = new ArrayList<>();
        
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                arrayList.add(strArr[i]);
            }
        }
       return arrayList.toArray(new String[arrayList.size()]);
    }
}