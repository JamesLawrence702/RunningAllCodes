public class Traversing {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int LB = 0;
        int UB = arr.length - 1;

        System.out.println("Traversing array using while loop:");
        int K = LB;
        while (K <= UB) {
            System.out.println("Element at index " + K + ": " + arr[K]);
            K++;
        }
        System.out.println();

        System.out.println("Traversing array using for loop:");
        for (int i = LB; i <= UB; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}