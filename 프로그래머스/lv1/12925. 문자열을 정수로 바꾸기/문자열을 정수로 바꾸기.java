class Solution {
    public int solution(String s) {
        int result;
        try {
            result = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }
}