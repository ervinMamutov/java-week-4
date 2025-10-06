package exceptions.exercises;

import java.util.Scanner;

/**
 * Exercise 1:
 * Ask the user to input two numbers.
 * Divides two numbers.
 * Catch ArithmeticException when dividing by zero.
 * Print a friendly error message like "Cannot divide by zero!".
 */

public class Exercise1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number1 ");
    String inp1 = scanner.next();
    System.out.println();
    System.out.print("Enter number2 ");
    String inp2 = scanner.next();
    int num1 = 0;
    int num2 = 0;

    try {
      num1 = Integer.parseInt(inp1);
      num2 = Integer.parseInt(inp2);
    } catch (NumberFormatException e) {
      System.out.println("The invalid enter");
    }
    try {
      System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
    } catch (ArithmeticException e) {
      System.out.println("Divided by 0");
    }
    scanner.close();
  }
}


