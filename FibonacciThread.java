import java.util.Scanner;

class FibonacciRunnable implements Runnable {
    private int n;

    public FibonacciRunnable(int n) {
        this.n = n;
    }
    public void run() {
        if (n <= 0) {
            System.out.println("Input must be a positive integer.");
            return;
        }

        int[] fibSeries = new int[n];
        if (n >= 1) fibSeries[0] = 0;
        if (n >= 2) fibSeries[1] = 1;

        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
        }

        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibSeries[i] + " ");
        }
        System.out.println();
    }
}

public class FibonacciThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        FibonacciRunnable fibRunnable = new FibonacciRunnable(n);
        Thread thread = new Thread(fibRunnable);
        thread.start();
    }
}
