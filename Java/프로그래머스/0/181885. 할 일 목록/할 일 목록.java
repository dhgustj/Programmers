import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> arrayList = new ArrayList<>();
        
        for(int i=0; i<todo_list.length; i++){
            if(String.valueOf(finished[i]).equals("false")){
                arrayList.add(todo_list[i]);
            }
        }
        return arrayList.toArray(new String[0]);
    }
}