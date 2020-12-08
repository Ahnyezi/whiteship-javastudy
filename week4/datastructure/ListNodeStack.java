package datastructure.stack;

import datastructure.linkedlist.ListNode;

public class ListNodeStack implements Stack {
    private ListNode head;
    private int stackSize = 0; // 노드 개수

    @Override
    public void push(int data) {
        stackSize += 1;
        if (head == null) {
            head = new ListNode(data);
            return;
        }
        getNodeAtThePosition(stackSize - 1).next = new ListNode(data);
    }

    @Override
    public int pop() {
        int result;
        if (head == null) {throw new IndexOutOfBoundsException();}
        if (stackSize == 1) {
            result = head.getData();
            head = null;
            stackSize = 0;
            return result;
        }

        ListNode prevNode = getNodeAtThePosition(stackSize - 1);
        result = prevNode.next.getData();
        prevNode.next = null;
        stackSize -= 1;
        return result;
    }

    // position 위치의 노드를 반환
    public ListNode getNodeAtThePosition(int position) {// position: 1 ~ stackSize
        if (position < 1 || position > stackSize) { throw new IndexOutOfBoundsException(); }
        if (position == 1) { return head; }

        ListNode node = head;
        for (int i = 1; i < position; i++) {
            node = node.next;
        }
        return node;
    }


    public String toString() {
        if (head == null) return "";

        String result = String.valueOf(head.getData()) + ',';
        while (head.next != null) {
            head = head.next;
            result += String.valueOf(head.getData()) + ',';
        }
        return result.substring(0, result.length() - 1);
    }
}
