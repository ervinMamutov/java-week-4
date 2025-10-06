package collections.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO:
 * 1. Create a List<String> words containing: "apple", "banana", "kiwi",
 * "strawberry", "pear".
 * 2. Create a new List<String> longWords that only contains words from the
 * first list with 5 or more letters.
 * 3. Print both lists.
 */
public class Exercise1 {
  public static void main(String[] args) {
    List<String> fruits = new ArrayList<>();
    List<String> longWords = new ArrayList<>();

    fruits.add("apple");
    fruits.add("banana");
    fruits.add("kiwi");
    fruits.add("strawberry");
    fruits.add("pear");

    for (String fruit : fruits) {
      char[] chars = fruit.toCharArray();

      if (chars.length >= 5) {
        longWords.add(fruit);
      }
    }
    System.out.println(fruits);
    System.out.println(longWords);

  }


}
