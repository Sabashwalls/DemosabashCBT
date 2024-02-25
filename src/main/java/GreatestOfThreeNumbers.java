public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        // Three numbers
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        // Compare the numbers
        int greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }

        // Display the greatest number
        System.out.println("The greatest number is: " + greatest);
    }
}
