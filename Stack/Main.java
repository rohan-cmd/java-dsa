package Stack;

class Stack {
    private Node top;
    private int height;

    Stack(){
        this.height = 0;
    }

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    // Time Complexity : O(1)
    public void push(int value){
        Node newNode = new Node(value);
        if (top==null) {
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    // Time Complexity : O(1)
    public void pop(){
        if (height==0) {
            return;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
    }

    public void display(){
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            System.out.println("-----");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getTop(){
        if (top==null) {
            return;
        }
        System.out.println("Top : " + top.value);
    }

    public void getHeight(){
        System.out.println("Height : " + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(8);
        st.push(6);
        st.push(4);
        st.push(2);

        st.display();
        st.getTop();
        st.getHeight();

        st.pop();
    }
}
