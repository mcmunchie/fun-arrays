import java.util.*;

public class Subarray {
    final int ROW = 15;
    final int COL = 20;
    private final int[][] array = new int[ROW][COL];

    /*
     * Method creates a 2-dimensional array with a
     * set row size of 15 and column size of 20.
     */
    public void fillArray() {
        int counter = 0;

        Random rand = new Random(); // randomly generate array elements within range[Min: -100, Max: 100]
        final int MAX = 100;
        final int MIN = -100;

        for (int i = 0; i < array.length; i++) // iterate through rows
            for (int j = 0; j < array[i].length; j++) // iterate through columns
                array[i][j] = rand.nextInt(MAX - MIN + 1) + MIN;

        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MIN; j++)
                counter++;
        }
        showArray(array); // print original array
        allPositive(array); // determine if all array elements are positive or not

        try (Scanner scan = new Scanner(System.in)) {
            char input;

            System.out.println("Do you want to start subarray processing (Y/N): ");
            input = scan.next().charAt(0);

            while (input == 'Y' || input == 'y') { // determine row size
                System.out.println("How many rows: ");
                int rowSize = scan.nextInt();

                while (rowSize <= 0 || !(rowSize < 15)) { // VALIDATE ROW SIZE!
                    System.out.println("ERROR! Should be positive and < 15. REENTER: ");
                    rowSize = scan.nextInt();
                }

                System.out.println("How many columns: "); // determine column size
                int colSize = scan.nextInt();

                while (colSize <= 0 || !(colSize < 20)) { // VALIDATE COLUMN SIZE!
                    System.out.println("ERROR! Should be positive and < 20. REENTER: ");
                    colSize = scan.nextInt();
                }
                // method calls to copy original array into subarray, print subarray and
                // determine positive elements in subarray
                copyArray(array);
                showSubArray(array, rowSize, colSize);

                System.out.println("\nDo you want to continue subarray processing (Y/N): "); // prompt user again
                input = scan.next().charAt(0);
            }
        }
    }

    public void showArray(int[][] array) { // print original array contents
        System.out.println("The original table is: ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++)
                System.out.print(array[row][col] + " ");
            System.out.println();
        }
    }

    public boolean allPositive(int[][] array) { // returns true if all elements of original array are positive and false
                                                // otherwise
        int positives = 0;
        int negatives = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= 0) {
                    ++positives;
                } else
                    ++negatives;
            }
        if (negatives == 0) {
            System.out.println("All elements in the original table are positive.");
            return true;
        } else
            System.out.println("Some elements in the original table are negative.");
        return false;
    }

    public int[][] copyArray(int[][] subarray) { // copies original array contents into subarray
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++)
                subarray[i][j] = array[i][j]; // copies elements into subarray
        }
        return subarray;
    }

    public void showSubArray(int[][] subarray, int rowSize, int colSize) { // prints subarray content
        System.out.println("The subarray is: ");
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++)
                System.out.print(array[row][col] + " ");
            System.out.println();
        }
        allPositive(subarray, rowSize, colSize); // call method to determine positive elements in subarray
    }

    public boolean allPositive(int[][] subarray, int rowSize, int colSize) { // returns true if all elements of subarray
                                                                             // are positive and false otherwise
        int positives = 0;
        int negatives = 0;
        for (int i = 0; i < rowSize; i++)
            for (int j = 0; j < colSize; j++) {
                if (array[i][j] >= 0) {
                    ++positives;
                } else
                    ++negatives;
            }
        if (negatives == 0) {
            System.out.println("All elements in this subarray are positive.");
            return true;
        } else
            System.out.println("Some elements in this subarray are negative.");
        return false;
    }
}
