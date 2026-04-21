import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String st : s.split("")){
            map.put(st,map.getOrDefault(st,0)+1);
        }
        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
         for (String key : keyList) {
            if (map.get(key) == 1) {
                answer += key;
            }
        }
        return answer;
    }
}