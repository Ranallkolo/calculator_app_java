import java.util.Scanner;

public class TwoDigitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first two-digit number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second two-digit number: ");
        int num2 = scanner.nextInt();

        System.out.print("Choose operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        int result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose +, -, *, or /.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
