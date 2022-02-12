import java.util.HashMap;

public class App {
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        int length = 201;
        for (String word : strs) {
            if (word.length() < length) {
                length = word.length();
            }
        }
        for (int i = 0; i < length; i++) {
            char letter = strs[0].charAt(i);
            for (String word : strs) {
                if (word.charAt(i) != letter) {
                    return result;
                }
            }
            result = result + strs[0].charAt(i);
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        String[] strs = { "a" };
        longestCommonPrefix(strs);
    }
}
