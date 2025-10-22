// UserInterface.java
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Calculator calculator;

    public UserInterface() {
        scanner = new Scanner(System.in);
        calculator = new Calculator();
    }

    public void performAddition() {
        System.out.println("Choose Addition Type:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.println("3. Add three integers");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter first integer: ");
                int a1 = scanner.nextInt();
                System.out.print("Enter second integer: ");
                int b1 = scanner.nextInt();
                System.out.println("Result: " + calculator.add(a1, b1));
                break;

            case 2:
                System.out.print("Enter first double: ");
                double a2 = scanner.nextDouble();
                System.out.print("Enter second double: ");
                double b2 = scanner.nextDouble();
                System.out.println("Result: " + calculator.add(a2, b2));
                break;

            case 3:
                System.out.print("Enter three integers: ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int z = scanner.nextInt();
                System.out.println("Result: " + calculator.add(x, y, z));
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

    public void performSubtraction() {
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();
        System.out.println("Result: " + calculator.subtract(a, b));
    }

    public void performMultiplication() {
        System.out.print("Enter first double: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double b = scanner.nextDouble();
        System.out.println("Result: " + calculator.multiply(a, b));
    }

    public void performDivision() {
        System.out.print("Enter numerator: ");
        int a = scanner.nextInt();
        System.out.print("Enter denominator: ");
        int b = scanner.nextInt();

        try {
            double result = calculator.divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mainMenu() {
        int choice;
        do {
            System.out.println("\n===== Calculator Application =====");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    System.out.println("Thank you for using the calculator!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}

