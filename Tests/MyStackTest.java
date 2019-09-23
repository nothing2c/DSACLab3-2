import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    void isBalanced()
    {
        String s1 = "(2+[5+7]+1)";
        boolean actual = MyStack.isBalanced(s1);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void isBalancedEmpty()
    {
        String s1 = "";
        boolean actual = MyStack.isBalanced(s1);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void isNotBalancedMismatch()
    {
        String s1 = "(2+[5+7]+1>";
        boolean actual = MyStack.isBalanced(s1);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void isNotBalanced()
    {
        String s1 = "(2+[5+7]+1>>>>>>>>>";
        boolean actual = MyStack.isBalanced(s1);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}