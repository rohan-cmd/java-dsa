package GenericClass;

public class Main {
    public static <T> void printVal(T val){
        System.out.println(val);
    }
    public static void main(String[] args) {
        // Generic Class example 
        Printer<Integer> printVal1 = new Printer<>(23);
        printVal1.print();

        Printer<String> printVal2 = new Printer<>("Rohan");
        printVal2.print();

        // Generic Methos example
        printVal(24);
        printVal("Varsha");
    }
}
