package Trees;
import java.util.*;

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

    // Delete using recusrion
    private Node rDelete(Node currNode, int value){
        if (currNode==null){
            return null;
        }

        if (value<currNode.value) {
            currNode.left = rDelete(currNode.left, value);
        }else if (value>currNode.value) {
            currNode.right = rDelete(currNode.right, value);
        }else{
            if (currNode.left==null && currNode.right==null) {
                return null;
            }else if(currNode.left==null){
                currNode = currNode.right;
            }else if(currNode.right==null){
                currNode = currNode.left;
            }else{
                int subTreeMin = minValue(currNode.right);
                currNode.value = subTreeMin;
                currNode.right = rDelete(currNode.right, subTreeMin);
            }
        }
    
        return currNode;
    }

    public void rDelete(int value){
        rDelete(root, value);
    }

    public int minValue(Node currNode){
        while (currNode.left!=null) {
            currNode = currNode.left;
        }
        return currNode.value;
    }

    // BFS Traversal
    public ArrayList<Integer> bfsTraversal(){
        Queue<Node> que = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if (root==null) {
            System.out.println(res);
            return res;
        }
        que.offer(root);
        while (!que.isEmpty()) {
            Node temp = que.poll();
            res.add(temp.value);
            if (temp.left!=null) {
                que.offer(temp.left);
            }
            if (temp.right!=null) {
                que.offer(temp.right);
            }
        }
        return res;
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
        
        // bst.rDelete(11);

        // System.out.println(bst.rContains(11));

        System.out.println(bst.bfsTraversal());
    }
}