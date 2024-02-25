import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // Generate and print 5 random numbers
        System.out.println("Random numbers:");
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(); // Generate a random integer
            System.out.println(randomNumber);
        }
    }
}

