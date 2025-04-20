package SinglyLinkedList;

class LinkedList{
    private Node head;
    private Node tail;
    int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
}

public class Main{
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
    }
}