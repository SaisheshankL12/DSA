package Sortings;
import java.util.*;
public class BubbleSort {
    	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		int[] arr1 = {1,2,3,4,5};
		bobble(arr1);
		System.out.println(Arrays.toString(arr1));
	}
	static void bobble(int[] arr){
	    boolean swapped;
		for(int i = 0; i < arr.length; i++) {
		    swapped = false; // 1st ittration if it sorted then braek
		    for(int j = 1; j < arr.length - i; j++){
		        if(arr[j] < arr[j - 1]) {
		            int temp = arr[j];
		            arr[j] = arr[j-1];
		            arr[j-1] = temp;
		            swapped = true;
		        }
		    }
		    if(!swapped) {
		        break;
		    }
		}
	}
}

