class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[a-zA-Z]", " ");
        String[] st = str.split(" ");

        for (String s : st) {
            if (!s.isEmpty()) {
             answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}