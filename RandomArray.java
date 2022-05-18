import java.util.*;

public class RandomArray {
    int[] array = new int[20]; // fill array based on given size

    /*
     * Method creates an array with 20 random numbers between 1 and 100
     */
    public void fillArray() {
        int counter = 0;

        Random rand = new Random(); // randomly generate array elements within range[Min: 1, Max: 100]
        final int MAX = 100;
        final int MIN = 1;

        for (int n = 0; n < array.length; n++) {
            array[n] = rand.nextInt(MAX - MIN + 1) + MIN;
        }

        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MIN; j++)
                counter++;
        }
        printArray(array); // prints the array
        printArrayReverse(array); // prints the array in reverse order
        searchMax(array); // finds the maximum element
        searchMin(array); // finds the minimum element
    }

    /*
     * Method prints the array
     */
    public static void printArray(int arr[]) {
        System.out.print("Random Array: ");
        for (int n = 0; n < arr.length; n++) {
        }
        System.out.print(Arrays.toString(arr));
    }

    /*
     * Method prints the array in reverse order
     */
    public static void printArrayReverse(int arr[]) {
        System.out.print("\nRandom Array in Reverse Order: ");
        for (int n = arr.length - 1; n >= 0; n--) {
            System.out.print(arr[n] + " ");
        }
    }

    /*
     * Method finds and returns the maximum element of the array (alternative
     * Math.max)
     */
    public static int searchMax(int arr[]) {
        int n;
        int max = arr[0]; // initialize maximum element

        // traverse arrary elements from second element/index
        // and compare every element with current max (index 0)
        for (n = 1; n < arr.length; n++)
            if (arr[n] > max)
                max = arr[n];

        System.out.println("\nMax Value of the Array: " + max);

        return max;
    }

    /*
     * Method finds and returns the minimum element of the array (alternative
     * Math.min)
     */
    public static int searchMin(int arr[]) {
        int n;
        int min = arr[0]; // initialize minimum element

        // traverse arrary elements from second element/index
        // and compare every element with current min (index 0)
        for (n = 1; n < arr.length; n++)
            if (arr[n] < min)
                min = arr[n];

        System.out.println("Min Value of the Array: " + min);

        return min;
    }
}
