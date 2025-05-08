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

    public boolean contains(int value){
        if (root==null) {
            return false;
        }

        Node temp = root;
        while (temp!=null) {
            if (temp.value==value) {
                return true;
            }
            if (value<temp.value) {
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        return false;
    }

    // Insert using recusrion
    private Node rInsert(Node currNode, int value){
        if (currNode==null){
            return new Node(value);
        }

        if (value<currNode.value) {
            currNode.left = rInsert(currNode.left, value);
        }else if (value>currNode.value) {
            currNode.right = rInsert(currNode.right, value);
        }

        return currNode;
    }

    public void rInsert(int value){
        if (root==null){
            root = new Node(value);
        }
        rInsert(root, value);
    }

    // Contains using recusrion
    private boolean rContains(Node currentNode, int value){
        if (currentNode==null) return false;

        if (currentNode.value==value) return true;

        if (value<currentNode.value) {
            return rContains(currentNode.left, value);
        }else{
            return rContains(currentNode.right, value);
        }
    }

    public boolean rContains(int value){
        return rContains(root, value);
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        // bst.insert(10);
        // bst.insert(7);
        // bst.insert(5);
        // bst.insert(8);
        // bst.insert(14);
        // bst.insert(11);
        // bst.insert(15);
        // System.out.println("Root : " + bst.root.value);
        // System.out.println(bst.root.left.value); 
        // System.out.println(bst.root.right.value); 
        // System.out.println(bst.root.left.left.value);
        // System.out.println(bst.root.left.right.value);
        // System.out.println(bst.root.right.left.value); 
        // System.out.println(bst.root.right.right.value); 

        // System.out.println(bst.contains(13));

        bst.rInsert(10);
        bst.rInsert(7);
        bst.rInsert(5);
        bst.rInsert(8);
        bst.rInsert(14);
        bst.rInsert(11);
        bst.rInsert(15);
        System.out.println("Root : " + bst.root.value);

        System.out.println(bst.rContains(11));

    }
}