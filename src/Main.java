import java.util.*;
import java.util.stream.Collectors;

public class Main {


  // testinput = t3e1s1n1p1u1

  public long noOfOccurences(String string, Integer characterAsLong) {
    return string.chars().filter(letter -> letter == characterAsLong).count();
  }

  public String arrayTask(String input) {

    String finalInput = input.replaceAll("\\s", "");

    int[] occurences = new int[256];

    char[] toCharacters = finalInput.toCharArray();

    for (char character : toCharacters) {
      occurences[(int) character]++;
    }

    StringBuilder result = new StringBuilder();
    for (char character : toCharacters) {
      if (occurences[character] > 0) {
        result.append(character).append(occurences[character]);
        occurences[character] = 0;
      }
    }

    return result.toString();
  }

  public String hashMapTask(String input) {

    String finalInput = input.replaceAll("\\s", "");

    HashMap<Character, Integer> hashMap = new HashMap<>();

    char[] toCharacters = finalInput.toCharArray();

    for (char character : toCharacters) {
      if (hashMap.containsKey(character)) hashMap.put(character, hashMap.get(character) + 1);
      else hashMap.put(character, 1);
    }

    StringBuilder result = new StringBuilder();

    for (char character : toCharacters) {
      if (hashMap.containsKey(character)) {
        result.append(character).append(hashMap.get(character));
        hashMap.remove(character);
      }
    }

    return result.toString();
  }

  public String streamTask(String input) {

    String finalInput = input.replaceAll("\\s", "");

    return finalInput
        .chars()
        .boxed()
        .sorted(
            (o1, o2) ->
                -Integer.compare(
                    (int) noOfOccurences(finalInput, o1), (int) noOfOccurences(finalInput, o2)))
        .distinct()
        .map(
            letter ->
                new StringBuilder()
                    .append(Character.toString(letter))
                    .append(noOfOccurences(finalInput, letter)))
        .collect(Collectors.joining());
  }

  public static void main(String[] args) {}
}
