package exceptions.exercises;

/**
 * Exercise 2:
 * Create an int array with 5 elements.
 * Ask the user for an index to access.
 * Catch ArrayIndexOutOfBoundsException if the index is invalid.
 * Print an appropriate message instead of crashing.
 */

public class Exercise2 {
  public static void main(String[] args) {

    int[] array = {1, 2, 3, 4, 5};

    int index = 6;

    try {
      System.out.println(array[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("The index out of range");
    }
  }
}
