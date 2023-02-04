package Sorts;

public class TestingSorts {

    public static void main(String[] args) {
        int[] array = new int[]{4,5,7,3,1,8,0,6,2,9};
//        BubbleSort.bubbleSort(array);
//        SelectSort.sort(array);
        InsertSort.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
