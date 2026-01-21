package Recursion;

public class Print {
    
    public static void main(String[] args) {
        int ans = fib(5);
        System.out.println(ans);
    }

    static int fib(int n) {
       if(n < 2) {
           return n;
       }
        //System.out.println(n);
        //pattern(n+1);
        return fib(n-1) + fib(n-2);
    }
}


