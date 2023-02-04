package Sorts;

public class BubbleSort {
    private static int swapCounter = 0;
    protected static void bubbleSort(int[] array) {
        boolean isSorted;
        do {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    swapCounter++;
                    isSorted = false;
                }
            }
        } while(!isSorted);
        System.out.println("Bubble sort made: " + swapCounter + " swaps.\n");
    }
}
