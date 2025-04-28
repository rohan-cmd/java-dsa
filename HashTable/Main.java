package HashTable;
import java.util.ArrayList;

class HashTable{
    private int size = 7; // If you take prime number as size it reduces the possibilities of collision
    private Node[] dataMap;

    HashTable(){
        dataMap = new Node[size];
    }

    class Node{
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    } 

    private int hash(String key){
        int hash = 0;
        char[] charHash = key.toCharArray();
        for(int i=0; i<charHash.length; i++){
            int hashCodeASCII = charHash[i];
            hash = (hash + hashCodeASCII * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index]==null) {
            dataMap[index] = newNode;
        }else{
            Node temp = dataMap[index];
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp!=null) {
            if (key==temp.key) {
                return temp.value;
            }
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList keys(){
        ArrayList<String> allKeys = new ArrayList<>();
        for(int i=0; i<dataMap.length; i++){
            Node temp = dataMap[i];
            while (temp!=null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

    public void printHashTable(){
        for(int i=0; i<dataMap.length; i++){
            System.out.print(i + " : ");
            Node temp = dataMap[i];
            while (temp!=null) {
                System.out.print("{" + temp.key + "," + temp.value + "} -> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

}

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.set("nails", 100);
        ht.set("tile", 50);
        ht.set("lumber", 80);

        ht.set("bolts", 200);
        ht.set("screws", 140);
        
        ht.printHashTable();

        // System.out.println(ht.get("tile"));
        // System.out.println(ht.get("wire"));

        System.out.println(ht.keys());
    }
}
