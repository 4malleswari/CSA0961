 class GCD
 {
    public static int gcd(int a, int b)
 {
        while (b != 0)
 {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
   public static void main(String[] args) {
        int num1 = 36;
        int num2 = 60;
        int gcdResult = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);
        int lcmResult = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmResult);
    }
}



