// LeetCode 744. Find Smallest Letter Greater Than Target

package Binary_Search;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'd'};
        char target = 'b';
        System.out.println(letter(ch, target));
    }
    static char letter(char[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; 
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}

