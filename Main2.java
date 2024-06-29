// Parent class
class Parent {
    // Method to print even numbers from 1 to 20
    public void even() {
        System.out.print("Parent - Even numbers (1 to 20): ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Method to print odd numbers from 1 to 20
    public void odd() {
        System.out.print("Parent - Odd numbers (1 to 20): ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Method to print prime numbers from 1 to 20
    public void prime() {
        System.out.print("Parent - Prime numbers (1 to 20): ");
        for (int i = 2; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Child class
class Child extends Parent {
    // Override method to print even numbers from 1 to 30
    @Override
    public void even() {
        System.out.print("Child - Even numbers (1 to 30): ");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Override method to print odd numbers from 1 to 30
    @Override
    public void odd() {
        System.out.print("Child - Odd numbers (1 to 30): ");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Override method to print prime numbers from 1 to 30
    @Override
    public void prime() {
        System.out.print("Child - Prime numbers (1 to 30): ");
        for (int i = 2; i <= 30; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Main class to test the methods
public class Main2 {
    public static void main(String[] args) {
        // Create an object of the Child class
        Child child = new Child();

        // Access all methods using the Child class object
        child.even();
        child.odd();
        child.prime();
    }
}
