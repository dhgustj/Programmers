class Solution {
    public String solution(String s) {
    String answer = "";
    String[] array = s.split(" ", -1);

    for (int j = 0; j < array.length; j++) {
        String str = array[j];

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                answer += String.valueOf(str.charAt(i)).toUpperCase();
            } else {
                answer += String.valueOf(str.charAt(i)).toLowerCase();
            }
        }

        if (j != array.length - 1) {
            answer += " ";
        }
    }
        return answer;
    }
}