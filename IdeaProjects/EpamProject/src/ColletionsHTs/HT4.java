package ColletionsHTs;
import java.util.*;
public class HT4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (scanner.hasNext()) {
                String input = scanner.next();
                boolean isBalanced = checkBalancedParentheses(input);
                System.out.println(isBalanced);
            }

            scanner.close();
        }

        public static boolean checkBalancedParentheses(String input) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')' || ch == '}' || ch == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    char top = stack.pop();

                    if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }
    }

