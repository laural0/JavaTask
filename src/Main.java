import java.util.*;
import java.util.stream.Collectors;

public class Main {

  // testinput = t3e1s1n1p1u1

  public long noOfOccurences(String string, Integer characterAsLong) {
    return string.chars().filter(letter -> letter == characterAsLong).count();
  }

  //  public String hashMaptask(String input) {
  //    HashMap<Character, Integer> values = new HashMap<>();
  //
  //    char[] toCharacters = input.toCharArray();
  //
  //    for (char character : toCharacters) {
  //      if (values.containsKey(character)) values.put(character, values.get(character) + 1);
  //      else values.put(character, 1);
  //    }
  //
  //    List<Integer> list = new ArrayList<>(values.values());
  //    list.sort(Collections.reverseOrder());
  //
  //    StringBuilder result = new StringBuilder();
  //    for (Integer occ : list)
  //      result.append().append(entry.getValue());
  //
  //    input = result.toString();
  //
  //    return input;
  //  }

  public String task(String input) {
    // Comparator.comparing(value -> noOfOccurences(input, value))
    return input
        .chars()
        .boxed()
        .sorted(
            new Comparator<Integer>() {
              @Override
              public int compare(Integer o1, Integer o2) {
                return -Integer.compare(
                    (int) noOfOccurences(input, o1), (int) noOfOccurences(input, o2));
              }
            })
        .distinct()
        .map(
            letter ->
                new StringBuilder()
                    .append(Character.toString(letter))
                    .append(noOfOccurences(input, letter)))
        .collect(Collectors.joining());
  }

  public static void main(String[] args) {}
}
