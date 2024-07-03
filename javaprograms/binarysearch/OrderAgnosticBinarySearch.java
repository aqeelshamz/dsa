package javaprograms.binarysearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] array = { 1, 3, 4, 5, 6, 7, 8, 10, 12, 14, 22, 26, 29, 32 };
        int[] arrayd = { 32, 29, 26, 22, 14, 12, 10, 8, 7, 6, 5, 4, 3, 1 };

        int element = 10;

        System.out.println(binarySearch(array, element));
        System.out.println(binarySearch(arrayd, element));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {
                end = isAsc ? mid - 1 : mid + 1;
            } else {
                start = isAsc ? mid + 1 : mid - 1;
            }
        }

        return -1;
    }
}
