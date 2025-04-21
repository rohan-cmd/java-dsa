package SinglyLinkedList;

class LinkedList{
    private Node head;
    private Node tail;
    private int length;

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

    public void prepend(int value){
        if (head==null) {
            append(value);
        }else{
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            length++;
        }
    }

    public void removeFirst(){
        if (head==tail) {
            tail = null;
        }
        head = head.next;
        length--;
    }

    public Node getNode(int index){
        if (index<0 || index>=length) {
            return null;
        }
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void setNode(int index, int value){
        Node temp = getNode(index);
        if (temp!=null) {
            temp.value = value;
        }
    }

    public void insert(int index, int value){
        if (index<0 || index>length) {
            return;
        }
        if (index == 0) {
            prepend(value);
            return;
        }
        if (index == length) {
            append(value);
            return;
        }
        Node temp = getNode(index-1);
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
    }

    public void remove(int index){
        if (index<0 || index>=length) {
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == length-1) {
            removeLast();
            return;
        }
        Node prev = getNode(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
    }

    public void reverseLL(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node prev = null;
        Node next = temp.next;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
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
        System.out.println("Tail : " + tail.value);
    }

    public void getLength(){
        System.out.println("Length : " + length);
    }
}

public class Main{
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();

        LL.append(2);
        LL.append(4);
        LL.append(6);
        LL.append(8);
        LL.append(10);

        LL.printLL();
        LL.getHead();
        LL.getTail();
        LL.getLength();

        // LL.removeLast();

        // LL.prepend(10);

        // LL.removeFirst();

        // LL.reverseLL();
 
        // LL.setNode(4, 100);

        // LL.insert(4, 100);

        // LL.remove(3);

        // LL.printLL();
        // LL.getHead();
        // LL.getTail();
        // LL.getLength();
    }
}