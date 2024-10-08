import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1; // Generates a number between 1 and 10
        int guess = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print("Guess the number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Number is out of range. Please enter a number between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!done);

        System.out.println("The random number was: " + randomNumber);
        if (guess < randomNumber) {
            System.out.println("Your guess is too low!");
        } else if (guess > randomNumber) {
            System.out.println("Your guess is too high!");
        } else {
            System.out.println("Your guess is on the money!");
        }
    }
}
