public class LoopingMultidemensional {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("Looping through array using for loop:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println(); 

        System.out.println("Looping through array using for-each loop:");
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println(); 
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        int x = myNumbers[1][2];
        System.out.println("Accessing a specific element from multidimensional array:");
        System.out.println("myNumbers[1][2]: " + x); 

        System.out.println(); 

        System.out.println("Looping through multidimensional array using nested for loops:");
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println("Element at myNumbers[" + i + "][" + j + "]: " + myNumbers[i][j]);
            }
        }
    }
}


