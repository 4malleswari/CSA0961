public class NthOddNumber {

    // Method to find the nth odd number after n odd numbers
    public static int findNthOddAfterN(int n) {
        // The Nth odd number is given by the formula (2n - 1)
        int nthOddNumber = 2 * n - 1;
        
        // The odd number after n odd numbers from nthOddNumber
        int nthOddAfterN = nthOddNumber + 2 * n;
        
        return nthOddAfterN;
    }

    public static void main(String[] args) {
        int N = 7;
        int nthOddAfterN = findNthOddAfterN(N);

        System.out.println("The " + N + "th odd number after " + N + " odd numbers is: " + nthOddAfterN);
    }
}
