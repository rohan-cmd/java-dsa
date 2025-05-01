package Heap;

import java.util.ArrayList;
import java.util.List;

class MinHp {
    private List<Integer> heap;

    public MinHp() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;

        while (current > 0 && heap.get(current) < heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }
    
    private void sinkDown(int index){
        int minIndex = index;

        while (true) {
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);

            if (leftIndex<heap.size() && heap.get(leftIndex)<heap.get(minIndex)) {
                minIndex = leftIndex;
            }

            if (rightIndex<heap.size() && heap.get(rightIndex)<heap.get(minIndex)) {
                minIndex = rightIndex;
            }

            if (minIndex!=index) {
                swap(minIndex, index);
                index = minIndex;
            }else{
                return;
            }

        }

    }

    public Integer remove() {
        if (heap.size() == 0) {
            return null;
        }

        if (heap.size() == 1) {
            return heap.remove(0);
        }

        int minValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);

        return minValue;
    }

}

public class MinHeap{
    public static void main(String[] args) {
        MinHp hp = new MinHp();
        hp.insert(10);
        hp.insert(20);
        hp.insert(80);
        hp.insert(30);
        hp.insert(150);
        hp.insert(60);
        hp.insert(40);

        System.out.println(hp.getHeap());

        hp.remove();

        System.out.println(hp.getHeap());
        
    }
    
}
