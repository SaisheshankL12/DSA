package BitManiplation;

import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number  " );    
        int n = sc.nextInt();
        System.out.println(oddOrEvn(n));
        sc.close();
    }
    static boolean oddOrEvn(int n) {
        return (n & 1) != 1;
    }
}
