//最佳解法
//时间复杂度 O(log 10（n))
//空间复杂度 O（1）
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        // 这里和reverse integer的算法类似，但是不用求出完整的reverse，因为判断回文
        // 算出“一半”就可以了，同时当输入是奇数位时，例如12321，x=12，rev=123，循环就会停止
        // 此时 x == rev / 10
        int rev = 0;
        while (x > rev) {
            int tail = x % 10;
            rev = rev * 10 + tail;
            x = x / 10;
        }
        return x == rev || x == rev / 10;
    }
}