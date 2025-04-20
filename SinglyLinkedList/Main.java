package SinglyLinkedList;

class LinkedList{
    private Node head;
    private Node tail;
    int length;

    LinkedList(){
        this.length = 0;
    }

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    } 

    public void append(int value){
        Node newNode = new Node(value);
        if (head==null) {
            head = newNode;
            tail = head;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void removeLast(){
        if (head==null && tail==null) {
            return;
        }
        if(head==tail){
            head = null;
            tail = null;
        }else{
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        length--;
    }

    public void printLL(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead(){
        if (head==null) {
            return;
        }
        System.out.println("Head : " + head.value);
    }

    public void getTail(){
        if (tail==null) {
            return;
        }
        System.out.println("Head : " + tail.value);
    }

    public void getLength(){
        System.out.println("Length : " + length);
    }
}

public class Main{
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();

        LL.append(2);
        // LL.append(4);
        // LL.append(6);
        // LL.append(8);
        // LL.append(10);

        LL.printLL();
        LL.getHead();
        LL.getTail();
        LL.getLength();

        LL.removeLast();

        LL.printLL();
        LL.getHead();
        LL.getTail();
        LL.getLength();

    }
}