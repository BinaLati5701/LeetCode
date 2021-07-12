import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if(s == null)
            return true;

        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray())
            switch(c){
                case '(': case '{': case '[':
                    stack.push(c); break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                        return false;
            }
        return stack.isEmpty();

    }

    //another way to solve it
    public static boolean isValid1(String s) {
        String left = "([{";
        String right = ")]}";
        char[] chararray = s.toCharArray();
        Stack minstack = new Stack();

        for (int i = 0; i < chararray.length; i++){

            if (minstack.isEmpty() && right.indexOf(chararray[i]) >=0) return false;

            if (left.indexOf(chararray[i]) >= 0) minstack.push(chararray[i]);
            else if (left.indexOf((char)minstack.pop()) != right.indexOf(chararray[i]))
                return false;
        }
        return minstack.isEmpty();
    }
    public static void main(String[]args){
        String s = "()[]{}";
        String s1 = "([)]";
        System.out.println(isValid(s));
        System.out.println(isValid(s1));
        System.out.println(isValid1(s));
        System.out.println(isValid1(s1));
    }
}
