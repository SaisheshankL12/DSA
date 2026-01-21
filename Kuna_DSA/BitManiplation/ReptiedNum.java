package BitManiplation;

public class ReptiedNum {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,1,2,3,4};
        System.out.println(rept(arr));
    }

    static int rept(int[] arr) {
        int ans = 0;
        for(int n : arr) {
            ans ^= n;
        }
        return ans;    // (2 ^ 2) ^ (1 ^ 1) ^ (3 ^ 3) ^ (4) = 0 ^ 0 ^ 0 ^ 6 = 6
    }
}
