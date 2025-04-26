
import java.util.Stack;

public class AdjacentDuplicate {

    public static String removeAdjacentDuplicates(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String usingStack(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        Stack<Character> stack = new Stack<>();
        stack.push(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (stack.peek() != str.charAt(i)) {
                stack.push(str.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeAdjacentDuplicates("aabbcc"));
    }

    public static String twoPointer(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
    
        char[] chars = str.toCharArray();
        int slow = 0;
        
        for (int fast = 1; fast < chars.length; fast++) {
            if (chars[fast] != chars[slow]) {
                slow++;
                chars[slow] = chars[fast];
            }
        }
        
        return new String(chars, 0, slow + 1);
    }
}
