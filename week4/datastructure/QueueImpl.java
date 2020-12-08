package datastructure.queue;

public class QueueImpl implements Queue {
    private int[] queue;

    @Override
    public void enqueue(int data) {
        if (queue == null) {
            queue = new int[]{data};
            return;
        }

        int size = queue.length;
        int[] tmp = queue.clone();
        queue = new int[size + 1];
        for (int i = 0; i < size; i++) {
            queue[i] = tmp[i];
        }
        queue[size] = data;
    }

    @Override
    public int dequeue() {
        if (queue == null) {throw new IndexOutOfBoundsException();}
        if (queue.length == 1) {
            int result = queue[0];
            queue = null;
            return result;
        }

        int size = queue.length;
        int[] tmp = queue.clone();
        queue = new int[size - 1];
        for (int i = 1; i < size; i++) {
            queue[i - 1] = tmp[i];
        }
        return tmp[0];
    }

    public String toString() {
        if (queue == null) {return "";}

        String result = "";
        for (int i = 0; i < queue.length; i++) {
            result += String.valueOf(queue[i]) + ',';
        }
        return result.substring(0, result.length() - 1);
    }
}
