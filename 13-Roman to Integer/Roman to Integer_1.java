//自己想出来的方法
class Solution {
    public int romanToInt(String s) {
        char[] c = s.toCharArray();
        int result = 0;
        int i = 0;
        while (i < c.length) {
            if (needTwoChar(c[i]) && i + 1 < c.length) {
                int k = getTwoCharNumber(c[i], c[i + 1]);
                if (k > 0) {
                    result += k;
                    i += 2;
                } else {
                    result += getOneCharNumber(c[i]);
                    i++;
                }
            } else {
                result += getOneCharNumber(c[i]);
                i++;
            }
        }
        return result;
    }

    private boolean needTwoChar(char a) {
        String s = String.valueOf(a);
        return s.equals("I") || s.equals("X") || s.equals("C");
    }

    private int getTwoCharNumber(char a, char b) {
        String s = String.valueOf(a) + String.valueOf(b);
        switch (s) {
        case "IV":
            return 4;
        case "IX":
            return 9;
        case "XL":
            return 40;
        case "XC":
            return 90;
        case "CD":
            return 400;
        case "CM":
            return 900;
        default:
            return 0;
        }
    }

    private int getOneCharNumber(char a) {
        String s = String.valueOf(a);
        switch (s) {
        case "I":
            return 1;
        case "V":
            return 5;
        case "X":
            return 10;
        case "L":
            return 50;
        case "C":
            return 100;
        case "D":
            return 500;
        case "M":
            return 1000;
        default:
            return 0;
        }
    }
}