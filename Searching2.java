public class Searching2 {
    public static Integer binarySearch(int[] data, int lb, int ub, int item) {
        int beg = lb;
        int end = ub;
        int mid;
        
        while (beg <= end) {
            mid = (beg + end) / 2;

            if (item < data[mid]) {
                end = mid - 1;
            }
            else if (item > data[mid]) {
                beg = mid + 1; 
            }
            else {
                return mid; 
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] data = {7, 9, 13, 21, 45, 101, 102};
        int lb = 0; 
        int ub = data.length - 1; 
        int item = 45;

        Integer loc = binarySearch(data, lb, ub, item);

        if (loc != null) {
            System.out.println("Item " + item + " found at location: " + (loc + 1));
        } else {
            System.out.println("Item " + item + " not found");
        }
    }
}
