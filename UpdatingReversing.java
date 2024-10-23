public class UpdatingReversing {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5}; 
        int[] array = originalArray.clone(); 

        System.out.println("Original Array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        int indexToUpdate = 2; 
        int newValue = 10;
        array[indexToUpdate] = newValue;

        System.out.println("Updated Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Array Before Reversing:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("Reversed Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}