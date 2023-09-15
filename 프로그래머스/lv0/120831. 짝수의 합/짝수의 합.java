class Solution {
    public int solution(int n) {
        int answer = solution2(n);
        return answer;
    }
    public static int solution2(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}