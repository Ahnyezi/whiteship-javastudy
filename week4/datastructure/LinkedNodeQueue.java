package datastructure.queue;

import datastructure.linkedlist.ListNode;

public class LinkedNodeQueue implements Queue {
    private ListNode head;
    private int queueSize = 0; // 노드 개수

    @Override
    public void enqueue(int data) {
        queueSize += 1;
        if (head == null) {
            head = new ListNode(data);
            return;
        }
        getNodeAtThePosition(queueSize-1).next = new ListNode(data);
    }

    @Override
    public int dequeue() {
        int result;
        if (head == null){throw new IndexOutOfBoundsException();}
        if (queueSize == 1){
            result = head.getData();
            head = null;
            queueSize = 0;
            return result;
        }

        result = getNodeAtThePosition(1).getData();
        head = getNodeAtThePosition(2);
        queueSize -= 1;
        return result;
    }

    // position 위치의 노드 반환
    public ListNode getNodeAtThePosition(int position) {// position : 1 ~ queueSize
        if (position < 1 || position > queueSize) {
            throw new IndexOutOfBoundsException();
        }
        if (position == 1) {
            return head;
        }

        ListNode node = head;
        for (int i = 1; i < position; i++) {
            node = node.next;
        }
        return node;
    }

    public String toString(){
        if (head == null) return "";
        String result = "";
        for (int i=1;i<=queueSize;i++){
            result += String.valueOf(getNodeAtThePosition(i).getData())+',';
        }
        return result.substring(0,result.length()-1);
    }

}
