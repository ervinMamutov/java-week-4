package collections.exercises;

import java.lang.reflect.Array;
import java.util.*;

/**
 * TODO:
 * 1. Create two lists of integers:
 * - list1: [1, 3, 5, 7, 9]
 * - list2: [2, 3, 4, 5, 6]
 * 2. Combine both into a new list that contains all elements.
 * 3. Remove duplicates from the combined list.
 * 4. Sort the final list in ascending order.
 * 5. Print the final result.
 */
public class Exercise2 {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6));
    Set<Integer> setArray = new TreeSet<>();

    for (int i = 0; i < list1.size(); i++) {
      setArray.add(list1.get(i));
      setArray.add(list2.get(i));
    }
    System.out.println(setArray);
  }
}
