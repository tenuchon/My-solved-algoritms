public class Fibonacci {

    public static long searchFibonacci(int i){
        long[] array = new long[i+1];
        array[0] = 1;
        array[1] = 1;

        for (int j = 2; j < array.length; j++) {
            array[j] = array[j-2] + array[j-1];
        }

        return array[i];
    }

    public static void main(String[] args) {
        System.out.println(searchFibonacci(5));
    }
}
