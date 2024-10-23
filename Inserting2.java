import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inserting2 {
    private static void addElement(
        Integer[] arr, int element,
        int position)
    {
        List<Integer> list = new ArrayList<>(
            Arrays.asList(arr));

        list.add(position - 1, element);

        arr = list.toArray(arr);

        System.out.println("Initial Array:\n"
            + Arrays.toString(arr));

        System.out.println("\nArray with " + element
            + " inserted at position "
            + position + ":\n"
            + Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        Integer[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

        int element = 138;

        int position = 8;

        addElement(arr, element, position);
    }
}
