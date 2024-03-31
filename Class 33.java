public class RecursionExample {
    public static void main(String[] args) {
        // Example of recursion: Factorial calculation
        int n = 5;
        int factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
        
        // Example of recursion: Fibonacci series
        int fibIndex = 7;
        System.out.println("Fibonacci series up to index " + fibIndex + ":");
        for (int i = 0; i < fibIndex; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive function to calculate factorial
    public static int calculateFactorial(int n) {
        // Base case: if n is 0 or 1, factorial is 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive call: factorial(n) = n * factorial(n - 1)
            return n * calculateFactorial(n - 1);
        }
    }

    // Recursive function to generate Fibonacci series
    public static int fibonacci(int n) {
        // Base cases: if n is 0 or 1, Fibonacci number is n
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Recursive call: fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
