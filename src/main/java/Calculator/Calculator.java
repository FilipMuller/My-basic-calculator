package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String continueOption = "yes";
        int calculationCount = 0;

        while (continueOption.trim().equalsIgnoreCase("yes")) {
            double number1, number2, result;
            char operation;

            System.out.println("Welcome to the calculator. \nEnter the first number: ");
            number1 = scanner.nextDouble();

            System.out.println("Enter the operation (+, -, *, /): ");
            operation = scanner.next().charAt(0);

            System.out.println("Enter the second number: ");
            number2 = scanner.nextDouble();

            switch (operation) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
                    return;
            }

            System.out.println("Result: " + result);
            calculationCount++;

            System.out.println("Do you want to perform another calculation? (yes/no): ");
            continueOption = scanner.next().trim().toLowerCase();
        }

        System.out.println("Thank you for using the calculator. \nNumber of calculations performed: " + calculationCount);
    }
}
