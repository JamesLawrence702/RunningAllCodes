import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Deleting3 {
    public static int[] removeTheElement(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        List<Integer> arrayList = IntStream.of(arr)
                                           .boxed()
                                           .collect(Collectors.toList());
        arrayList.remove(index);

        return arrayList.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
    }
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int index = 0;

        System.out.println("Index to be removed: " + index);

        arr = removeTheElement(arr, index);

        System.out.println("Resultant Array: " + Arrays.toString(arr));
    }
}