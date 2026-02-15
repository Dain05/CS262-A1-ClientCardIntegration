import java.util.InputMismatchException;
import java.util.Scanner;

public class OnboardingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("----- Digital Onboarding -----");

            System.out.print("Enter Client ID Number: ");
            int idNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Card Number: ");
            String cardNumber = sc.nextLine();

            System.out.print("Enter Starting Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter PIN (numbers only): ");
            int pin = sc.nextInt();

            boolean isActive = false;

            Client client = new Client(
                    idNumber, firstName, lastName, age,
                    cardNumber, balance, pin, isActive
            );

            System.out.println("\n----- Initial Profile -----");
            System.out.println(client);

            System.out.println("\nActivating card...");
            client.getCard().activateCard();

            System.out.println("\nChange PIN");
            System.out.print("Enter old PIN: ");
            int oldPin = sc.nextInt();

            System.out.print("Enter new PIN: ");
            int newPin = sc.nextInt();

            client.getCard().updatePin(oldPin, newPin);

            System.out.println("\n----- Final Updated Profile -----");
            System.out.println(client);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input detected. Please enter the correct data type.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\nThank you for using the Digital Onboarding System.");
            sc.close();
        }
    }
}