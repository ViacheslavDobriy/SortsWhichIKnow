package Sorts;

public class SelectSort {
    private static int swapCounter = 0;
    protected static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {

                if(array[j] < array[minIndex]){

                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
                swapCounter++;
            }
        }
        System.out.println("Select sort made: " + swapCounter + " swaps.\n");

    }
}
