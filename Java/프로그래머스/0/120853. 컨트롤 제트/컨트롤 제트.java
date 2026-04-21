import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        List<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<str.length; i++){
            if(str[i].equals("Z")){
                arrayList.remove(arrayList.size()-1);
            }else{
                arrayList.add(Integer.parseInt(str[i]));
            }
        }
        for(int j : arrayList){
            answer += j;
        }
        return answer;
    }
}