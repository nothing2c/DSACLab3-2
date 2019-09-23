import java.util.Deque;
import java.util.LinkedList;

public class MyStack {

    public static void main(String[] args) {

    }

    public static boolean isBalanced(String expression)
    {
        Deque<Character> stack = new LinkedList();
        boolean balanced = true;
        int index = 0;

        while(balanced && (index < expression.length()))
        {
            char character = expression.charAt(index);

            if(isOpen(character))
                stack.push(character);
            else if(isClose(character))
            {
                if(stack.isEmpty())
                    balanced = false;
                else
                {
                    char topChar = stack.pop();

                    if(!areMatching(topChar, character))
                        balanced = false;
                }
            }

            index++;
        }

        if(balanced && stack.isEmpty())
            return true;
        else
            return false;
    }

    private static boolean isOpen(char ch)
    {
        boolean isOpen;

        switch(ch)
        {
            case '(':
                isOpen = true;
                break;

            case '[':
                isOpen = true;
                break;

            case '{':
                isOpen = true;
                break;

            case '<':
                isOpen = true;
                break;

            default:
                isOpen = false;
        }

        return isOpen;
    }

    private static boolean isClose(char ch)
    {
        boolean isOpen;

        switch(ch)
        {
            case ')':
                isOpen = true;
                break;

            case ']':
                isOpen = true;
                break;

            case '}':
                isOpen = true;
                break;

            case '>':
                isOpen = true;
                break;

            default:
                isOpen = false;
        }

        return isOpen;
    }

    private static boolean areMatching(char open, char close)
    {
        boolean matching;

        if(open == '(' && close ==')')
            matching = true;

        else if(open == '[' && close ==']')
            matching = true;

        else if(open == '{' && close =='}')
            matching = true;

        else if(open == '<' && close =='>')
            matching = true;

        else
            matching = false;

        return  matching;
    }
}
