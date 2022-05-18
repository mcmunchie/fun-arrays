import java.util.*;

public class OneArray {
    /*
     * Method creates a 1-dimensional array with n elements
     * based on user input. Max size is 15.
     */
    public void fillArray() {
        try (Scanner scan = new Scanner(System.in)) {
            char input;

            System.out.println("Do you want to start (Y/N): ");
            input = scan.next().charAt(0);

            while (input == 'Y' || input == 'y') { // determine array size
                System.out.println("Enter array size: ");
                int size = scan.nextInt();

                while (size <= 0 || !(size <= 15)) { // VALIDATE!
                    System.out.println("ERROR! Should be positive and <= 15. REENTER: ");
                    size = scan.nextInt();
                }

                double[] array = new double[size]; // fill array based on given size
                int counter = 0;

                System.out.println("Now enter " + size + " values: ");
                for (int i = 0; i < size; i++) {
                    array[i] = scan.nextDouble();
                    counter += array[i];
                }
                // method calls to print array, compute sums and averages
                printArray(array);
                arraySumAvg(array);
                arrayEvenSum(array);
                arrayOddSum(array);

                System.out.println("\nDo you want to continue (Y/N): "); // prompt user again
                input = scan.next().charAt(0);
            }
        }
    }

    public void printArray(double[] array) { // prints array contents
        System.out.print("The array elements are: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public double arraySumAvg(double[] array) { // computes the sum and averages of elements in the array
        double sum = 0.0; // initialize sum to 0

        for (int i = 0; i < array.length; i++) { // compute the sum
            sum += array[i]; // sum = sum + array[i];
        }
        System.out.println(""); // space
        System.out.printf("The sum of elements is %.2f\n", sum);

        double average = (sum / array.length); // compute the average
        System.out.println(""); // space
        System.out.printf("The average of elements is %.2f\n", average);

        return sum;
    }

    public double arrayOddSum(double[] array) { // compute the sum of all elements with odd indexes
        double odd = 0;

        for (int i = 0; i < array.length; i++)
            if (!(i % 2 == 0)) // determine odd indexes
                odd += array[i]; // compute sum of all odd indexes
        System.out.printf("The sum of the elements with odd indexes is %.2f\n", odd);
        return odd;
    }

    public double arrayEvenSum(double[] array) { // compute the sum of all elements with even indexes
        double even = 0;

        for (int i = 0; i < array.length; i++)
            if (i % 2 == 0) // determine even indexes
                even += array[i]; // compute sum of all even indexes
        System.out.printf("The sum of the elements with even indexes is %.2f\n", even);
        return even;
    }
}
