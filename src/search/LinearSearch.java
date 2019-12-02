package search;

public class LinearSearch {

    private static int linearSearch(int arr[], int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
        }
        return -1;
    }

    private static void print(int elementToSearch, int index) {
        if (index == -1) {
            System.out.println(elementToSearch + " not found.");
        } else {
            System.out.println(elementToSearch + " found at index: " + index);
        }
    }

    public static void main(String[] args) {
        int index = linearSearch(new int[]{56, 7, 8, 87, 34, 21}, 34);
        print(34, index);
    }
}
