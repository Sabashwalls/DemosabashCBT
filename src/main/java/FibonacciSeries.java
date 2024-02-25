public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Define the number of terms in the series

        // Initialize the first two terms of the Fibonacci series
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci series from 1 to 10:");

        // Print the first two terms
        System.out.print(a + ", " + b);
        

        // Calculate and print the remaining terms
        for (int i = 2; i < n; i++) {
            int c = a + b; // Calculate the next term
            System.out.print(", " + c); // Print the next term
            a = b; // Update the first term
            b = c; // Update the second term
        }
    }
}
