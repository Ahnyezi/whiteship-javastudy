package datastructure.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LinkedNodeQueueTest {
    private LinkedNodeQueue queue;

    @BeforeEach
    public void init() {
        queue = new LinkedNodeQueue();
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(5);
    }

    @Test
    @DisplayName("enqueue test")
    public void enqueueTest() {
        assertEquals("1,3,5", queue.toString());
    }

    @Test
    @DisplayName("dequeue test")
    public void dequeueTest() {
        assertAll("dequeue test",
                () -> {//큐(1,3,5)에서 2번 pop 한 결과
                    queue.dequeue();
                    queue.dequeue();
                    assertEquals("5", queue.toString());
                },
                () -> {//큐(5)에서 1번 pop 한 결과
                    queue.dequeue();
                    assertEquals("", queue.toString());
                },
                () -> {//빈 큐에서 pop 시도할 경우
                    Exception exception = assertThrows(IndexOutOfBoundsException.class, () ->
                            queue.dequeue());
                }
        );

    }

}
