package collections.exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * TODO:
 * 1. Create two sets of strings:
 * - setA = ["Java", "Python", "C++", "Go"]
 * - setB = ["JavaScript", "Python", "Ruby", "Go"]
 * 2. Find and print:
 * - Languages that exist in both sets
 * - Languages unique to setA
 * - Languages unique to setB
 */
public class Exercise3 {
  public static void main(String[] args) {
    Set<String> setA =
            new HashSet<>(Arrays.asList("Java", "Python", "C++", "Go"));
    Set<String> setB =
            new HashSet<>(Arrays.asList("JavaScript", "Python", "Ruby", "Go"));

    Set<String> uniqueA = new HashSet<>(setA);
    Set<String> uniqueB = new HashSet<>(setB);
    Set<String> setAB = new HashSet<>();

    for (String itemB : setB) {
      uniqueA.remove(itemB);
      setAB.add(itemB);
    }

    for (String itemA : setA) {
      uniqueB.remove(itemA);
      setAB.add(itemA);
    }

    System.out.println("setA" + setA);
    System.out.println("Unique A " + uniqueA);
    System.out.println("setB " + setB);
    System.out.println("Unique B " + uniqueB);
    System.out.println("AB " + setAB);


  }

}
