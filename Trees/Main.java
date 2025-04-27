package Trees;

class BinarySearchTree{
    Node root;

    class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }

    public boolean insert(int value){
        Node newNode = new Node(value);
        if (root==null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value==temp.value) {
                return false;
            }
            if (newNode.value<temp.value) {
                if(temp.left==null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }else{
                if(temp.right==null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(10);
        bst.insert(60);
        bst.insert(40);
        bst.insert(70);
        System.out.println("Root : " + bst.root.value);
        System.out.println(bst.root.left.value);
        System.out.println(bst.root.left.right.value);
        System.out.println(bst.root.right.value);
        System.out.println(bst.root.right.right.value);
    }
}