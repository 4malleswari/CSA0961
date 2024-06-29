import java.util.Arrays;

public class MthMaxNthMin {
    
    public static int findMthMax(int[] arr, int M) {
        // Sort the array in descending order
        Arrays.sort(arr);
        int[] descendingArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            descendingArr[i] = arr[arr.length - 1 - i];
        }
        return descendingArr[M - 1];
    }
    
    public static int findNthMin(int[] arr, int N) {
        // Sort the array in ascending order
        Arrays.sort(arr);
        return arr[N - 1];
    }
    
    public static void main(String[] args) {
        int[] arr = {14, 16, 87, 36, 25, 89, 34};
        int M = 1;
        int N = 3;
        
        int MthMax = findMthMax(arr, M);
        int NthMin = findNthMin(arr, N);
        
        int sum = MthMax + NthMin;
        int difference = MthMax - NthMin;
        
        System.out.println(M + "st Maximum Number = " + MthMax);
        System.out.println(N + "rd Minimum Number = " + NthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
    }
}
