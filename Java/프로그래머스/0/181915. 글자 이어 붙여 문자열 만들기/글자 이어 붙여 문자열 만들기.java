class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] array = new char[index_list.length];
        for(int i=0; i<index_list.length; i++){
            array[i] = my_string.charAt(index_list[i]);
        }
        answer = String.valueOf(array);
        return answer;
    }
}