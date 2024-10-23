import java.util.Arrays;

public class Searching1 {
    public static int linearSearch(int[] data, int n, int item) {
        int[] newData = Arrays.copyOf(data, n + 1);
        newData[n] = item;
        
        int loc = 0;

        while (newData[loc] != item) {
            loc++;
        }
        if (loc == n) {
            loc = 0; 
        }

        return loc;
    }

    public static void main(String[] args) {
        int[] data = {13, 7, 6, 45, 21, 9, 101, 102}; 
        int n = data.length; 
        int item = 45; 

        int loc = linearSearch(data, n, item);

        if (loc != 0) {
            System.out.println("Item " + item + " found at location: " + (loc + 1));
        } else {
            System.out.println("Item " + item + " not found");
        }
    }
}
