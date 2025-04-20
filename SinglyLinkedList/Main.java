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



    public void printLL(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead(){
        System.out.println("Head : " + head.value);
    }

    public void getTail(){
        System.out.println("Head : " + tail.value);
    }

    public void getLength(){
        System.out.println("Length : " + length);
    }
}

public class Main{
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
    }
}