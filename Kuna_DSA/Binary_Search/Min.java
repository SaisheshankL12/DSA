package Binary_Search;

class Solution {
    public int findMin(int[] nums) {
        int ans = binarySearch(nums);
        return ans;
    }
    int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return arr[start];
    }
}