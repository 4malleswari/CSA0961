import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CommonElementsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first array
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input second array
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Find common elements
        ArrayList<Integer> commonElements = findCommonElements(array1, array2);

        // Display the common elements
        System.out.print("Common elements: " + commonElements);
        
        scanner.close();
    }

    public static ArrayList<Integer> findCommonElements(int[] array1, int[] array2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> commonSet = new HashSet<>();

        // Add elements of the first array to a set
        for (int num : array1) {
            set1.add(num);
        }

        // Find common elements by checking each element of the second array
        for (int num : array2) {
            if (set1.contains(num)) {
                commonSet.add(num);
            }
        }

        // Convert the set of common elements to a list
        return new ArrayList<>(commonSet);
    }
}
