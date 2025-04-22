package Queue;

class Queue {
    private Node front;
    private Node rear;
    private int length;

    Queue(){
        this.length = 0;
    }

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    } 

    // Time Complexity : O(1)
    public void enqueue(int value){
        Node newNode = new Node(value);
        if (front==null) {
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        length++;
    }

    // Time Complexity : O(1)
    public void dequeue(){
        if (front==null) {
            return;
        }
        if (front==rear) {
            front = null;
            rear = null;
        }else{
            Node temp = front;
            front = front.next;
            temp.next = null;
        }
        length--;
    }

    public void display(){
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.value + " <- ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getFront(){
        if (front==null) {
            return;
        }
        System.out.println("Front : " + front.value);
    }

    public void getRear(){
        if (rear==null) {
            return;
        }
        System.out.println("Rear : " + rear.value);
    }

    public void getLength(){
        System.out.println("Length : " + length);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Queue que = new Queue();

        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);

        que.display();
        que.getFront();
        que.getRear();
        que.getLength();

        // que.dequeue();
    }
}
