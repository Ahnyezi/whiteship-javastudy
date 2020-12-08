package datastructure.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackImplTest {
    private StackImpl stack;

    @BeforeEach
    public void init() {
        stack = new StackImpl();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
    }

    @Test
    @DisplayName("push test")
    public void pushTest() {
        assertEquals("1,3,5,7", stack.toString());
    }

    @Test
    @DisplayName("pop test")
    public void popTest() {
        assertAll("pop test",
                () -> {//스택(1,3,5,7)에서 2번 pop한 후의 배열 확인
                    stack.pop();
                    stack.pop();
                    assertEquals("1,3", stack.toString());
                },
                () -> {//스택(1,3)에서 2번 pop한 후의 배열 확인
                    stack.pop();
                    stack.pop();
                    assertEquals("", stack.toString());
                },
                () -> {//스택(null)에서 pop을 시도하면 예외 처리
                    Exception exception = assertThrows(IndexOutOfBoundsException.class, () ->
                            stack.pop());
                });
    }
}
