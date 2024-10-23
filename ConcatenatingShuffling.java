import java.util.Random;

public class ConcatenatingShuffling {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        System.out.println("Array 1:");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Array 2:");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] concatenatedArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            concatenatedArray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            concatenatedArray[array1.length + i] = array2[i];
        }

        System.out.println("Concatenated Array:");
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        Random random = new Random();
        for (int i = 0; i < concatenatedArray.length; i++) {
            int randomIndex = random.nextInt(concatenatedArray.length);
            int temp = concatenatedArray[i];
            concatenatedArray[i] = concatenatedArray[randomIndex];
            concatenatedArray[randomIndex] = temp;
        }

        System.out.println("Shuffled Array:");
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }
    }
}
