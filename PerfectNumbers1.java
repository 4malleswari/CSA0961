public class PerfectNumbers1 {

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int num) {
        if (num < 2) {
            return false;
        }
        int sumOfDivisors = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
                if (i != num / i) {
                    sumOfDivisors += num / i;
                }
            }
        }
        return sumOfDivisors == num;
    }

    // Method to find the first n perfect numbers
    public static void findPerfectNumbers(int n) {
        int count = 0;
        int num = 2;
        System.out.print("First " + n + " perfect numbers are: ");
        while (count < n) {
            if (isPerfectNumber(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N = 3; // You can change this value to find a different number of perfect numbers
        findPerfectNumbers(N);
    }
}
