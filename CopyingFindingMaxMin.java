public class CopyingFindingMaxMin {
    public static void main(String[] args) {
        int[] originalArray = {3, 5, 1, 8, 2};
        int[] copiedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        System.out.println("Copied Array:");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        int max = originalArray[0];
        int min = originalArray[0];

        for (int num : originalArray) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
