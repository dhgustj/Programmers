import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for(String s1 : before.split("")){
            map1.put(s1,map1.getOrDefault(s1,0)+1);
        }
        for(String s2 : after.split("")){
            map2.put(s2,map2.getOrDefault(s2,0)+1);
        }
        if(map1.equals(map2)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}