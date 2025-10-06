package collections.exercises;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO:
 * 1. Create a Set<Integer> randomNumbers and add 15 random integers between
 * 1 and 20.
 * 2. Check if the set contains the number 10.
 * 3. Remove all numbers less than 5.
 * 4. Print the final set.
 */
public class Exercise4 {
  public static void main(String[] args) {
    Set<Integer> randomNumbers = new HashSet<>();
    for (int i = 0; i < 15; i++) {
      randomNumbers.add((int) (Math.random() * 100));
    }

    System.out.println("Origin set " + randomNumbers);

    if (randomNumbers.contains(10)) {
      System.out.println("The 10 is contains");
    } else {
      System.out.println("The 10 is not contains");
    }
    Set<Integer> newSet = new HashSet<>(randomNumbers);
    for (int num : randomNumbers) {
      if (num < 5) {
        newSet.remove(num);
      }
    }
    System.out.println(newSet);
  }
}
