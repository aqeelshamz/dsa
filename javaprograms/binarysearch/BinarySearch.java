package javaprograms.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 1, 3, 4, 5, 6, 7, 8, 10, 12, 14, 22, 26, 29, 32 };

        int element = 10;

        System.out.println(binarySearch(array, element));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
