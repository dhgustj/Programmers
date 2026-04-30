import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> arrayList = new ArrayList<>();
     
        while(n > 0){
            arrayList.add(0, n % 3);
            n /= 3;
        }
        Collections.reverse(arrayList);
        int j=0;
        
        for(int i=arrayList.size()-1; i>=0; i--){
            answer += arrayList.get(i) * Math.pow(3,j);
            j++;
        }
        return answer;
    }
}