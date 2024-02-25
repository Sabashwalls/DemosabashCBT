public class PerfectNumber {
    public static void main(String[] args) {
        int number = 28; // Change this number to test different inputs

        // Check if the number is perfect or not
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    // Function to check if a number is perfect or not
    public static boolean isPerfectNumber(int num) {
        int sum = 1; // Start with 1 because all numbers are divisible by 1
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; // Add divisor to sum if it divides the number evenly
            }
        }
        // If the sum of divisors equals the original number, it's perfect
        return sum == num;
    }
}
