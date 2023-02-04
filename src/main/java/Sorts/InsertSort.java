package Sorts;

public class InsertSort {

    private static int swapCounter = 0;

    protected static void sort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            for (int j = i; j > 0 && array[j-1]>array[j] ; j--) {
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                swapCounter++;
            }
        }
        System.out.println("Insert sort made: " + swapCounter + " swaps.\n");

    }
}
