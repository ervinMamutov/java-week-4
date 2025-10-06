package exceptions.exercises;

import java.util.Scanner;

/**
 * Exercise 3:
 * Ask the user to enter a number.
 * Convert the input from String to int using Integer.parseInt().
 * Catch NumberFormatException if the user enters invalid input.
 */

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input number");
    String answer = scanner.next();

    try {
      System.out.println(Integer.parseInt(answer));
    } catch (NumberFormatException e) {
      System.out.println("This is not a number");
    }
  }
}
