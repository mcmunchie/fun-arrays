import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Fruits {

    private String fruits[] = new String[30]; // array to hold fruits

    // constructor
    // takes string fileName and looks for file with that name
    public Fruits(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        try (Scanner sc = new Scanner(file)) {
            int i = 0;
            while (sc.hasNextLine()) {
                fruits[i] = sc.nextLine();
                i++;
            }
        }
    }

    public void printArray() { // prints contents of fruits array
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        System.out.println(); // whitespace between results
    }

    public void sortArray() { // sorts fruits into alphabetical order using selection sort
        for (int last = fruits.length - 1; last >= 1; last--) {
            int maxIndex = 0;

            for (int index = 1; index <= last; index++) {
                if (fruits[index].compareTo(fruits[maxIndex]) > 0) {
                    maxIndex = index;
                }
                // do swap
                String temp = fruits[maxIndex];
                fruits[maxIndex] = fruits[last];
                fruits[last] = temp;
            }
        }
    }
}
