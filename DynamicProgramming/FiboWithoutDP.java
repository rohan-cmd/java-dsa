package DynamicProgramming;

public class FiboWithoutDP {
    static int count = 0;
    public static int fib(int n){
        count++;
        if(n==1 || n==0){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(7));
        System.out.println(count);
    }
}
