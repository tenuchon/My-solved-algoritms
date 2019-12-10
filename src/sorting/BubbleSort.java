package sorting;

public class BubbleSort {

    private static void toSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    private static void printArray(int[] array) {
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[]{18, 33, 28, 44, 12, 34, 57, 87};

        printArray(array);
        toSort(array);
        printArray(array);
    }
}
