import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) throws FileNotFoundException {
                try (Scanner sc = new Scanner(System.in)) {
                        // test Fruits
                        System.out.println("Enter the file path of the file with fruit names: ");
                        String fruitsInput = sc.nextLine();
                        Fruits testFruit = new Fruits(fruitsInput);

                        // print unsorted array
                        testFruit.printArray();

                        // separate outputs
                        System.out.println();

                        // sort and print sorted array
                        testFruit.sortArray();
                        testFruit.printArray();
                }

                // // test OneArray
                // System.out.println();
                // OneArray array = new OneArray();
                // array.fillArray();
                // System.out.println();

                // // test TwoArray
                // System.out.println();
                // TwoArray array = new TwoArray();
                // array.fill2DArray();
                // System.out.println();

                // // test Subarray
                // System.out.println();
                // Subarray array = new Subarray();
                // array.fillArray();
                // System.out.println();

                // // test RandomArray
                // System.out.println();
                // RandomArray array = new RandomArray();
                // array.fillArray();
                // System.out.println();
        }
}
