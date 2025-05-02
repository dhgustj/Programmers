#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    int answer = 0;
    string as = to_string(a);
    string bs = to_string(b);
    string str1 = as + bs;
    string str2 = bs + as;
    if (stoi(str1) > stoi(str2)){
        answer = stoi(str1);
    }
    else if (stoi(str1) < stoi(str2)){
        answer = stoi(str2);
    }
    else{
        answer = stoi(str1);
    }
    return answer;
}