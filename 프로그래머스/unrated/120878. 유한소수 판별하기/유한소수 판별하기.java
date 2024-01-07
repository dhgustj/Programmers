class Solution {
    public int solution(int a, int b) {
        int number = b / gcd(a,b);
        while(number != 1){
            if(number % 2 == 0) number /= 2;
            else if(number % 5 ==0) number /= 5;
            else return 2;
        }
        return 1;
    }
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
    } else {
        return gcd(b, a % b);
        }
    }
}               