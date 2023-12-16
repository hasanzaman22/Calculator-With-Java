import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        Scanner scn = new Scanner(System.in);
        System.out.println("Write the first number.");
        double num1 = scn.nextDouble();
        System.out.println("Write the second number.");
        double num2 = scn.nextDouble();
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Choose which operation you want to perform with the numbers you enter.
                1. +  |  Plus
                2. -  |  Minus
                3. *  |  Multiply
                4. /  |  Plenty""");
        String operator = input.nextLine().toLowerCase();
        double sum = 0;

        switch (operator) {
            case "1", "+", "plus" -> sum = operations.Plus(num1, num2);
            case "2", "-", "minus" -> sum = operations.Minus(num1, num2);
            case "3", "*", "multiply" -> sum = operations.Multiply(num1, num2);
            case "4", "/", "plenty" -> {
                if (num2 == 0) {
                    System.out.println("The denominator of any fraction cannot have the value zero.");
                    return;
                }
                sum = operations.Plenty(num1, num2);
            }
        }

        System.out.println("Result: " + sum);
    }
}