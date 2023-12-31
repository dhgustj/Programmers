import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int small = numbers[0]*numbers[1];
        int large = numbers[numbers.length-2]*numbers[numbers.length-1];
        return (small<large) ? large:small;
    }
}