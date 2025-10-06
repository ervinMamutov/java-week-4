package collections.exercises;

import java.util.*;

/**
 * TODO:
 * 1. Create a List<String> words = ["apple", "banana", "apple", "orange",
 * "banana", "apple"].
 * 2. Use a Map<String, Integer> to count how many times each word appears.
 * 3. Print the word counts (e.g., apple → 3, banana → 2, orange → 1).
 */

public class Exercise5 {
  public static void main(String[] args) {
    List<String> words = new ArrayList<>(
            Arrays.asList("apple", "banana", "apple", "orange", "banana",
                    "apple"));

    Map<String, Integer> wordCount = new HashMap<>();

    for (String word : words) {
      int count = word.length();
      wordCount.put(word, count);
    }
    System.out.println(wordCount);
  }
}