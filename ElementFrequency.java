import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    
    public static void findFrequencies(int[] arr) {
        // Use a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Iterate over the array and update the frequency of each element in the map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Print the frequencies
        System.out.println("Element | Frequency");
        System.out.println("--------------------------");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + "       | " + entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        findFrequencies(arr);
    }
}
