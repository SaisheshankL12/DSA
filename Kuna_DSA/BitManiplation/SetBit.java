package BitManiplation;

public class SetBit {
    public static void main(String[] args) {
        int n = 9; // 1001 = 2 ones 
        System.out.println(setbit(n));     
    }
     static int setbit(int n) {
        int count = 0;
        while(n > 0) {
            // n -= (n & -n); or
            n = n & (n-1);
            count++;
        }
        return count;
     }
}
