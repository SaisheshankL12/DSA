package Binary_Search;

import java.util.*;

public class Bs2DArray {
    public static void main(String[] args) {
        int[][] arr = {
     // c =  0   1    2   3  
            {10, 20, 30, 40}, // r = 0
            {15, 25, 35, 45}, // r = 1
            {28, 27, 37, 49}, // r = 2
            {33, 34, 38, 40} // r = 4
        };
        int target = 37;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;
        while(r < arr.length && c >= 0) {
            if(arr[r][c] == target) {
                return new int[] {r, c};
            }else if(arr[r][c] < target) {
                r++;
            }else {
                c--;
            }
        }
        return new int[] {-1, -1};
    }
}
