package datastructure.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListNodeStackTest {
    private ListNodeStack stack;

    @BeforeEach
    public void init() {
        stack = new ListNodeStack();
        stack.push(1);
        stack.push(3);
        stack.push(5);
    }

    @Test
    @DisplayName("push test")
    public void pushTest() {
        assertEquals("1,3,5", stack.toString());
    }


    @Test
    @DisplayName("pop test")
    public void popTest() {
        assertAll("pop test",
                ()->{//스택(1,3,5)에서 2번 pop 한 결과
                    stack.pop();
                    stack.pop();
                    assertEquals("1",stack.toString());
                },
                ()->{//스택(1)에서 1번 pop 한 결과 null
                    stack.pop();
                    assertEquals("",stack.toString());
                },
                ()->{//빈 스택에서 pop 시도할 경우 예외처리
                    Exception exception = assertThrows(IndexOutOfBoundsException.class,()->
                            stack.pop());
                });
    }
}
