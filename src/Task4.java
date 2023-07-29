import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class Task4 {
    /**
     *  Последовательность [((())()(())]] неправильная
     *  Исправленная последовательность: [[((()))()(())]]
     * @return boolean
     * @throws IOException
     */
    public boolean checkBracketSequence() throws IOException {
        System.out.println("Введите скобочную последовательность:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String brackets = br.readLine();
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put('{', '}');
        bracketsMap.put('[', ']');

        for (int i = 0; i < brackets.length(); i++) {
            Character current = brackets.charAt(i);
            if (bracketsMap.containsKey(current)) {
                stack.push(current);
            }
            else if (bracketsMap.containsValue(current)) {
                if (bracketsMap.get(stack.peek()).equals(current)) {
                    stack.pop();
                }
                else {
                    System.out.println("Последовательность неправильная");
                    return false;
                }
            }
        }
        System.out.println("Последовательность правильная");
        return true;
    }
}
