package DoublyLinkedList;

class DoublyLinkedList{
    private Node head;
    private Node tail;
    private int length;

    DoublyLinkedList(){
        this.length = 0;
    }

    class Node{
        int value;
        Node prev;
        Node next;

        Node(int value){
            this.value = value;
        }
    } 

    public void append(int value){
        Node newNode = new Node(value);
        if (head==null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public void removeLast(){
        if (head==null) {
            return;
        }
        if (head==tail) {
            head = null;
            tail = null;
        }else{
            Node temp = tail.prev;
            tail.prev = null;
            temp.next = null;
            tail = temp;
        }
        length--;
    }

    public void prepend(int value){
        if (head==null) {
            append(value);
        }else{
            Node newNode = new Node(value);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            length++;
        }
    }

    public void removeFirst(){
        if (head==null) {
            return;
        }
        if (head==tail) {
            removeLast();
        }else{
            Node temp = head;
            head = head.next;
            temp.next = null;
            head.prev = null;
            length--;
        }
    }

    public void reverseDLL(){
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public void printDLL(){
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
        System.out.println("Tail : " + tail.value);
    }

    public void getLength(){
        System.out.println("Length : " + length);
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList DLL = new DoublyLinkedList();

        DLL.append(2);
        DLL.append(4);
        DLL.append(6);
        DLL.append(8);

        DLL.printDLL();
        DLL.getHead();
        DLL.getTail();
        DLL.getLength();
        // DLL.reverseDLL();

        // DLL.removeLast();

        // DLL.prepend(10);

        // DLL.removeFirst();

        DLL.printDLL();
        DLL.getHead();
        DLL.getTail();
        DLL.getLength();
    }
}
