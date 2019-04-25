
//自己想出来的解法
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int reverse = reverse(x);
            if (x == reverse) {
                return true;
            }
        }
        return false;
    }

    private int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            result = result * 10 + tail;
            x = x / 10;
        }
        return result;
    }
}