package DynamicProgramming;

public class FiboWithDP {
    static int count = 0;
    static Integer[] memo = new Integer[100];
    public static int fib(int n){
        count++;
        if (memo[n]!=null) {
            return memo[n];
        }
        if(n==1 || n==0){
            return n;
        }
        memo[n] = fib(n-1) + fib(n-2);
        return memo[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(7));
        System.out.println(count);
    }
}
