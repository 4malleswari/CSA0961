import java.util.Arrays;
class NthLargestNumberFinder {

    public static void main(String[] args) {
        int[] array = {14, 67, 48, 23, 5, 62};
        int N = 4;

        try {
            int nthLargest = findNthLargest(array, N);
            System.out.println(N + "th Largest number: " + nthLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findNthLargest(int[] array, int N) {
        if (N <= 0 || N > array.length) {
            throw new IllegalArgumentException("N is out of the array's bounds.");
        }

        // Sort the array in descending order
        Arrays.sort(array);

        // The nth largest element will be at the (length - N) index
        return array[array.length - N];
    }
}
