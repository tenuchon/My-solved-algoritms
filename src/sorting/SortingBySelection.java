package sorting;

public class SortingBySelection {

    private static void sortBySelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = min(array, i);
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    private static int min(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];

        for (int i = start + 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[]{34, 45, 1, 23, 5, 876, 98, 43, 5, 652, 12, 65, 87, 23, 83, 93};

        printArray(array);
        sortBySelection(array);
        printArray(array);
    }


}
