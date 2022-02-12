import java.util.Stack;

public class App {
    public static boolean isValid(String s) {
        Stack<Character> closingBracketsStack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(') {
                closingBracketsStack.push(')');
                continue;
            } else if (bracket == '[') {
                closingBracketsStack.push(']');
                continue;
            } else if (bracket == '{') {
                closingBracketsStack.push('}');
                continue;
            }

            if (closingBracketsStack.isEmpty() || closingBracketsStack.pop() != bracket) {

                System.out.println("closingBracketsStack.isEmpty(): " + closingBracketsStack.isEmpty());
                return false;
            }
        }
        return closingBracketsStack.isEmpty();
    }

    public static void main(String[] args) throws Exception {

        System.out.println(isValid("([])"));
    }
}
