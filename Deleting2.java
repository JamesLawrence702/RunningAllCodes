import java.util.Arrays;
import java.util.stream.IntStream;

class Deleting2 {
    public static int[] removeTheElement(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        return IntStream.range(0, arr.length)
                        .filter(i -> i != index)
                        .map(i -> arr[i])
                        .toArray();
    }
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int index = 3;

        System.out.println("Index to be removed: " + index);

        arr = removeTheElement(arr, index);

        System.out.println("Resultant Array: " + Arrays.toString(arr));
    }
}
