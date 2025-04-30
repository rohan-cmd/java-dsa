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
}
    
public class Main {
    public static void main(String[] args) {
        Heap hp = new Heap();

        hp.insert(78);
        hp.insert(60);
        hp.insert(55);
        hp.insert(99);
        hp.insert(40);
        hp.insert(10);
        hp.insert(30);

        System.out.println(hp.getHeap());
    }
}
