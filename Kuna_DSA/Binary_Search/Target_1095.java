package Binary_Search;
public class Target_1095 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(slov(arr, target));
    }
    static int slov(int[] arr, int target) {
        int pk = peak(arr);
        
        if(pk == -1) {
            return findEle(arr, target, 0, arr.length-1);
        }
        if(arr[pk] == target){
            return pk;
        }
        if(target >= arr[0]) {
            return findEle(arr, target, 0, pk-1);
        }
        return findEle(arr, target, pk+1, arr.length-1);
    }
    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findEle(int[] arr,int target,int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target==arr[mid]) {
                return mid;
            }
            else if(arr[mid] > target) {
                end = mid - 1;
            }else {
                start = mid +1;
            }
            
        }
           return -1;
    }

}
