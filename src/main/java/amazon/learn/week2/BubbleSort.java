package amazon.learn.week2;

import java.util.Random;
import java.util.Timer;

public class BubbleSort {

    int size = 1000;
    int[] arr = new int[size];

   void fillArrayWithRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size);
        }
    }

    void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
        // 1.2.3.4

    void sortArray() {
       for(int j = 0; j < size; j++) {
           for (int i = 0; i < (size - 1); i++) {
               if (arr[i] > arr[i + 1]) {
                   int temp = arr[i];
                   arr[i] = arr[i + 1];
                   arr[i + 1] = temp;
               }
           }
       }
    }

    static void main() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.fillArrayWithRandomNumbers();
//        bubbleSort.printArray();
        long start = System.currentTimeMillis();
        bubbleSort.sortArray();
        long end = System.currentTimeMillis();

        System.out.println("Time taken to sort the array: " + (end - start) + " Milliseconds");
//        bubbleSort.printArray();
    }

}
