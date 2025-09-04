class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String [] array = {"a","e","i","o","u"};
        for(String s : array){
            answer = answer.replaceAll(s,"");
        }
        return answer;
    }
}