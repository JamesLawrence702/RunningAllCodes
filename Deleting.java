import java.util.Arrays;

class Deleting4 {
    public static int[] removeTheElement(int[] arr, int index)
    {
        if (arr == null
            || index < 0
            || index >= arr.length) {
 
            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
 
        System.arraycopy(arr, 0, anotherArray, 0, index);
        
        System.arraycopy(arr, index + 1,
                         anotherArray, index,
                         arr.length - index - 1);
 
        return anotherArray;
    }
    public static void main(String[] args)
    {
        int[] arr = { 11, 22, 33, 44, 55 };
 
        System.out.println("Original Array: "
                           + Arrays.toString(arr));
 
        int index = 6;
 
        System.out.println("Index to be removed: "
                           + index);
 
        arr = removeTheElement(arr, index);
 
        System.out.println("Resultant Array: "
                           + Arrays.toString(arr));
    }
}
