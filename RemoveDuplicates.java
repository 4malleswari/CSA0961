import java.util.Scanner;

public class RemoveDuplicates {

    // Function to remove duplicates from an array
    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        
        // Check if the array is empty or has only one element
        if (n == 0 || n == 1) {
            return array;
        }

        // Temporary array to store unique elements
        int[] temp = new int[n];
        int j = 0;

        // Iterate through the array and store unique elements in temp
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[n - 1];

        // Create a new array with the size of unique elements
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in array
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();

        // Input the elements of the array
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Sort the array to bring duplicates together
        java.util.Arrays.sort(array);

        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array);

        // Output the unique elements
        System.out.println("Non-duplicate items:");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}
