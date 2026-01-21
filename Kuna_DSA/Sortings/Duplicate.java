package Sortings;

import java.util.Arrays;

public class Duplicate {
    	public static void main(String[] args) {
	    int[] arr = {1,2,2,3,4};
	    cyclical(arr);
	    System.out.println(Arrays.toString(arr));
	}
	static int cyclical(int[] arr) {
	    int i = 0;
	    while(i < arr.length) {
	        int corr = arr[i] - 1;
	        if(arr[i] != arr[corr]) {
	            swap(arr, i, corr);
	        }else{i++;}
	    }
	    return arr[arr.length - 1];
	}
	static void swap(int[] arr, int first, int second) {
	    int temp = arr[first];
	    arr[first] = arr[second];
	    arr[second] = temp;
	}
}
