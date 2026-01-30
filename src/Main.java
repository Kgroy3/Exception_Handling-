import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            validateAge(age);
            System.out.println("Age accepted. You are eligible.");

        } catch (InvalidAgeException e) {
            logger.log(Level.SEVERE, "Custom Exception Occurred", e);
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Runtime Exception Occurred", e);
            System.out.println("Invalid input. Please enter a number.");

        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }

    // Method that throws custom exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }
}
