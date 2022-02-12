import java.util.Vector;

public class App {

    public static boolean isPalindrome(int x) {
        int length = String.valueOf(x).length();
        System.out.println("length: " + length);
        int[] digits = new int[length];
        length = length - 1;
        for (int i = 0; i <= length; i++) {
            digits[i] = x % 10;
            System.out.println("digits[i]: " + digits[i]);
            x = x / 10;
        }
        if (x < 0) {
            return false;
        } else {
            for (int i = 0; i <= length; i++) {
                System.out.println("i: " + i);

                if (i == length - i) {
                    continue;
                }
                if (digits[i] != digits[length - i]) {
                    System.out.println("digits[length - i]: " + digits[length - i]);
                    System.out.println("digits[i] : " + digits[i]);
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {

        boolean result = isPalindrome(101);
        System.out.println("result: " + result);

    }
}
