import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println("Output: " + result);
    }
    
    public static boolean canConstruct(String ransomNote, String magazine) {
        // Create a hashmap to count characters in magazine
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count characters in magazine
        for (char c : magazine.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Check characters in ransomNote
        for (char c : ransomNote.toCharArray()) {
            // Use Character.valueOf(c) to convert char to Character
            if (!charCount.containsKey(c) || charCount.get(c) <= 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        
        return true;
    }
}
