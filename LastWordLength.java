public class LastWordLength {
    public static void main(String[] args) {
        String s = "Hello World";
        int length = lengthOfLastWord(s);
        System.out.println("Length of the last word: " + length);
    }
    
    public static int lengthOfLastWord(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();
        
        // Find the index of the last space
        int lastIndex = s.lastIndexOf(' ');
        
        // The last word starts right after the last space
        String lastWord = s.substring(lastIndex + 1);
        
        // Return the length of the last word
        return lastWord.length();
    }
}
