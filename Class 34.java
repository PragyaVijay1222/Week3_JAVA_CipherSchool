public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive function to generate Fibonacci series
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: Fibonacci number at index 0 is 0
        } else if (n == 1) {
            return 1; // Base case: Fibonacci number at index 1 is 1
        } else {
            // Recursive call: fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
