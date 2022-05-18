import java.util.*;

public class TwoArray {
    /*
     * Method creates 2-dimensional array and gets the row
     * and column sizes from the user.
     */
    public void fill2DArray() {
        try (Scanner scan = new Scanner(System.in)) {
            char input;

            System.out.println("Do you want to start (Y/N): ");
            input = scan.next().charAt(0);

            while (input == 'Y' || input == 'y') { // determine row size
                System.out.println("Enter row size: ");
                int rowSize = scan.nextInt();

                while (rowSize <= 0) { // VALIDATE ROW SIZE!
                    System.out.println("ERROR! Should be positive. REENTER: ");
                    rowSize = scan.nextInt();
                }

                System.out.println("Enter column size: "); // determine column size
                int colSize = scan.nextInt();

                while (colSize <= 0) { // VALIDATE COLUMN SIZE!
                    System.out.println("ERROR! Should be positive. REENTER: ");
                    colSize = scan.nextInt();
                }

                int[][] array = new int[rowSize][colSize]; // fill array based on given size
                int counter = 0;

                Random rand = new Random(); // randomly generate array elements within range[Min: 1, Max: 100]
                final int MAX = 100;
                final int MIN = 1;

                for (int i = 0; i < array.length; i++) // iterate through rows
                    for (int j = 0; j < array[i].length; j++) // iterate through columns
                        array[i][j] = rand.nextInt(MAX - MIN + 1) + MIN;

                for (int i = 0; i < MAX; i++) {
                    for (int j = 0; j < MIN; j++)
                        counter++;
                }
                // method calls to print array and compute the average
                printArray(array);
                columnAvg(array);

                System.out.println("\nDo you want to continue (Y/N): "); // prompt user again
                input = scan.next().charAt(0);
            }
        }
    }

    public void printArray(int[][] array) { // prints array contents
        System.out.println("The original table is: ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++)
                System.out.print(array[row][col] + " ");
            System.out.println();
        }
    }

    public void columnAvg(int[][] array) { // computes the average of each column
        double total;
        double average = 0;
        System.out.println("The average of each column: ");

        for (int col = 0; col < array[0].length; col++) {
            total = 0;
            for (int row = 0; row < array.length; row++) {
                total += array[row][col];
            }
            average = total / array.length;
            System.out.printf("%.2f\t", average);
            total = 0;
        }
    }
}
