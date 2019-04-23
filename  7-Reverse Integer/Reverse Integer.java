class Solution {
    // 时间复杂度 O(log(x))
    // 空间复杂度 O(1)
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                // overflow
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}