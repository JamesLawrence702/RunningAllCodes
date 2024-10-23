import java.util.Arrays;

public class Sorting {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int k = 0; k < n - 1; k++) {
            for (int ptr = 0; ptr < n - k - 1; ptr++) {
                if (arr[ptr] > arr[ptr + 1]) {
                    int temp = arr[ptr];
                    arr[ptr] = arr[ptr + 1];
                    arr[ptr + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {13, 7, 6, 45, 21, 9, 101, 102};
        System.out.println("Arrays.sort() - Original arr1[]: " + Arrays.toString(arr1));
        
        Arrays.sort(arr1);
        System.out.println("Sorted arr1[] with Arrays.sort(): " + Arrays.toString(arr1));

        int[] arr2 = {13, 7, 6, 45, 21, 9, 101, 102};
        System.out.println("Bubble Sort - Original arr2[]: " + Arrays.toString(arr2));
        
        bubbleSort(arr2);
        System.out.println("Sorted arr2[] with Bubble Sort: " + Arrays.toString(arr2));
    }
}
