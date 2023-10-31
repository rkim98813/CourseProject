package exercise.week2.day6;
import java.util.Scanner;

class MaxHeap{
    int[] heap;
    int size;
    int capacity;

    MaxHeap(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        heap = new int[capacity + 1];
    }


    /*void insert(int data){
        size++;
        heap[size] = data;
        adjust(heap, size, 1);
        }
    }*/

    void insert(int data) {
        if (size < capacity) {
            size++;
            heap[size] = data; // 마지막 위치에 데이터 삽입

            int currentIndex = size;

            // 삽입한 데이터를 부모와 비교하면서 조정
            while (currentIndex > 1) {
                int parentIndex = currentIndex / 2;

                if (heap[currentIndex] > heap[parentIndex]) {
                    // 현재 원소가 부모보다 크다면 교환
                    int temp = heap[currentIndex];
                    heap[currentIndex] = heap[parentIndex];
                    heap[parentIndex] = temp;

                    currentIndex = parentIndex;
                } else {
                    // 부모보다 크지 않으면 조정 완료
                    break;
                }
            }
        } else {
            System.out.println("Heap is full. Cannot insert data.");
        }
    }


    int delete() {
        int deletedData = heap[1];
        heap[1] = heap[size];
        size--;
        adjust(heap, 1, size);
        return deletedData;
    }


    public void update(int index, int val) {
        if (index >= 1 && index <= size) {
            heap[index] = val;
            adjust(heap, 1, size);
        } else {
            System.out.println("Invalid index.");
        }
    }

    void sort(){
        int n = this.size;

        for (int i = n; i > 0; i--) {
            int temp = this.heap[1];
            this.heap[1] = this.heap[i];
            this.heap[i] = temp;
            adjust(this.heap, 1, i - 1);
        }
    }


    void adjust(int[] heap, int root, int n) {
        int child, rootkey;
        rootkey = heap[root];
        child = 2 * root;

        while (child <= n) {
            if (child < n && heap[child] < heap[child + 1]) {
                child++;
            }
            if (rootkey > heap[child]) {
                break;
            } else {
                heap[child / 2] = heap[child];
                child *= 2;
            }
        }
        heap[child / 2] = rootkey;
    }


    void print(){
        if (size == 0) {
            System.out.println("Heap is empty.");
            return;
        }
        System.out.print("Max Heap 출력: ");
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }


}

public class HeapMain {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        // maxHeap() 출력
        maxHeap.print();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1:Insert 2:Delete 3:Update 4:Sort 5:Print 6:Exit");
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.print("입력 ");
                    maxHeap.insert(scanner.nextInt());
                    System.out.println("입력 완료");
                    break;
                case 2:
                    int deleted = maxHeap.delete();
                    if (deleted != -1) {
                        System.out.println("삭제 값: " + deleted);
                    }
                    break;
                case 3:
                    System.out.print("인덱스 값: ");
                    int index = scanner.nextInt();

                    System.out.print("새로운 값 입력: ");
                    int newValue = scanner.nextInt();

                    maxHeap.update(index, newValue);

                    System.out.println("변경 완료");
                    maxHeap.print();
                    break;
                case 4:
                    maxHeap.sort();

                    System.out.println("정렬 완료");
                    maxHeap.print();
                    break;
                case 5:
                    maxHeap.print();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("다시 하라");
            }
        }
    }
}
