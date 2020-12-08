package datastructure.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LinkedListImplTest {
    private LinkedListImpl list;
    private ListNode head;

    @BeforeEach
    public void init() {
        list = new LinkedListImpl();
        head = list.add(null, new ListNode(1), 0);
        head = list.add(head, new ListNode(3), 1);
        head = list.add(head, new ListNode(5), 2);
        head = list.add(head, new ListNode(7), 3);
    }

    @Test
    @DisplayName("add test")
    public void addTest() {
        assertAll("add test",
                () -> {// init()에서 생성한 linkedlist를 확인
                    assertEquals("1,3,5,7", list.toString(head));
                },
                () -> {// 허용범위를 벗어난 position에 add하려는 경우
                    Exception exception = assertThrows(IndexOutOfBoundsException.class, () ->
                            list.add(head, new ListNode(9), list.getSize(head) + 1));
                }
        );
    }

    @Test
    @DisplayName("remove test")
    public void removeTest() {
        assertAll("remove test",
                () -> {// 연결리스트(1,3,5,7)에서 위치가 3(idx 기준)인 node 삭제
                    assertEquals("1,3,5", list.toString(list.remove(head, 3)));
                },
                () -> {// 허용범위를 벗어난 position의 노드를 remove하려는 경우
                    Exception exception = assertThrows(IndexOutOfBoundsException.class, () ->
                            list.remove(head, list.getSize(head)));
                });
    }

    @Test
    @DisplayName("contains test")
    public void containsTest() {
        assertAll("contains test",
                () -> {// 연결리스트(1,3,5,7)가 1을 포함하는지 확인
                    assertTrue(list.contains(head, new ListNode(1)));
                },
                () -> {// 연결리스트(1,3,5,7)가 11을 포함하지 않는지 확인
                    assertFalse(list.contains(head, new ListNode(11)));
                });
    }
}
