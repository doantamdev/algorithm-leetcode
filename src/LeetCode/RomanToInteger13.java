package LeetCode;

public class RomanToInteger13 {

    public static int romanToInt(String s) {
        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int currentVal = getRomanValue(s.charAt(i));

            // Kiểm tra nếu ký tự tiếp theo có giá trị lớn hơn ký tự hiện tại
            if (i < n - 1 && getRomanValue(s.charAt(i + 1)) > currentVal) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }

        return result;
    }

    private static int getRomanValue(char romanChar) {
        switch (romanChar) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // Không hợp lệ
        }
    }

    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV";
        System.out.println("The integer value of Roman numeral " + romanNumeral + " is: " + romanToInt(romanNumeral));
    }
}
