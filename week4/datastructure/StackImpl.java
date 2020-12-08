package datastructure.stack;

public class StackImpl implements Stack {
    private int arr[];

    @Override
    public void push(int data) {
        // data가 arr의 첫번째 원소가 되는 경우
        if (arr == null) {
            arr = new int[]{data};
            return;
        }
        
        int size = arr.length;          // 기존 arr 크기 가져오기
        int tmp[] = arr.clone();        // 깊은 복사
        arr = new int[size + 1];        // arr 크기 증가
        for (int i = 0; i < size; i++) {// 새로운 arr에 기존 값 삽입
            arr[i] = tmp[i];
        }
        arr[size] = data;// 마지막 방에 data 삽입
    }

    @Override
    public int pop() {
        // pop할 원소가 없는 경우
        if (arr == null) throw new IndexOutOfBoundsException();

        // arr 원소가 1개인 경우
        if (arr.length == 1) {
            int result = arr[0];
            arr = null;
            return result;
        }

        int size = arr.length;              // 기존 arr 크기 가져오기
        int tmp[] = arr.clone();            // 깊은 복사
        arr = new int[size - 1];            // arr 크기 감소
        for (int i = 0; i < size - 1; i++) {// 새로운 arr에 기존 값 삽입
            arr[i] = tmp[i];
        }
        return tmp[size - 1];
    }

    public String toString() {
        if (arr == null) return "";
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += String.valueOf(arr[i]) + ',';
        }
        return result.substring(0, result.length() - 1);
    }
}
