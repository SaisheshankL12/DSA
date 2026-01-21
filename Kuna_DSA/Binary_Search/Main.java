//Leet Code 34. Find First and Last Position of Element in Sorted Array

package Binary_Search;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,3,3,3,4,4,5,5,6,7};
        int target = 3;
        int[] ans = {-1, -1};

        ans[0] = find(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = find(arr, target, false);
        }

        System.out.println(Arrays.toString(ans));
    }
    static int find(int[] arr, int target, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findFirst) {
                    end = mid - 1;   
                } else {
                    start = mid + 1; 
                }
            }
        }
        return ans;
    }
}
