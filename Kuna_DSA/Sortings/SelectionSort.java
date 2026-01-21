package Sortings;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int max = getMax(arr, 0, last);
            swap(arr, max, last);
        }
    }
    static int getMax(int[] arr, int start, int end) {
        int max = start;
        for(int i = 0; i <= end; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
