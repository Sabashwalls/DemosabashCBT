import java.util.Scanner;

public class evenandodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        //int number = scanner.nextInt();
        int number1=1223;

        if (number1 % 2 == 0) {
            System.out.println(number1 + " is an even number.");
        } else {
            System.out.println(number1 + " is an odd number.");
        }

        //scanner.close();
    }
}
