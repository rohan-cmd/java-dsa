package Heap;

import java.util.ArrayList;
import java.util.List;

// leftChild = 2 * ParentNode
// rightChild = 2 * ParentNode + 1
// ParentNode = Index/2

class Heap {
    private List<Integer> heap;

    public Heap(){
        this.heap = new ArrayList<Integer>();
    }

    public List<Integer> getHeap(){
        return new ArrayList<>(heap);
    }

    private int leftChild(int index){
        return 2 * index + 1;
    }

    private int rightChild(int index){
        return 2 * index + 2;
    }
    
    private int parent(int index){
        return (index-1)/2; 
    }

    private void swap(int index1, int index2){
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value){
        heap.add(value);
        int current = heap.size()-1;

        while (current>0 && heap.get(current) > heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public Integer remove(){

        if (heap.size()==0) {
            return null;
        }

        if (heap.size()==1) {
            return heap.remove(0);
        }

        int maxHeap = heap.get(0);
        heap.set(0, heap.remove(heap.size()-1));
        sinkDown(0);
        return maxHeap;
    }

    private void sinkDown(int index){
        int maxIndex = index;

        while (true) {
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);

            if (leftIndex<heap.size() && heap.get(leftIndex)>heap.get(maxIndex)) {
                maxIndex = leftIndex;
            }

            if (rightIndex<heap.size() && heap.get(rightIndex)>heap.get(maxIndex)) {
                maxIndex = rightIndex;
            }

            if (maxIndex!=index) {
                swap(maxIndex, index);
                index = maxIndex;
            }else{
                return;
            }

        }

    }

}
    
public class MaxHeap {
    public static void main(String[] args) {
        Heap hp = new Heap();

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
