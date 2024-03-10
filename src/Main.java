import java.util.*;
import java.util.stream.Collectors;

public class Main {

  // testinput = t3e1s1n1p1u1
  public long noOfOccurences(String string, Integer characterAsLong) {
    return string.chars().filter(letter -> letter == characterAsLong).count();
  }

  public int indexInString(String string, Character character){
    return string.indexOf(character);
  }


  public String hashMapTask(String input) {


    HashMap<Character, Integer> occurency = new HashMap<>();
    List<Character> characters = new ArrayList<>();

    String finalInput = input.replaceAll("\\s", "");
    char[] charArray = finalInput.toCharArray();

    for (char character : charArray) {

      if (occurency.containsKey(character)) {
        occurency.put(character, occurency.get(character) + 1);
      } else occurency.put(character, 1);


      if(!characters.contains(character)) characters.add(character);
    }

    characters =
        characters.stream()
            .sorted(
                (o1, o2) -> {
                  if (!occurency.get(o1).equals(occurency.get(o2)))
                    return -Integer.compare(occurency.get(o1), occurency.get(o2));
                  else return Integer.compare(indexInString(input, o1), indexInString(input, o2));
                })
            .toList();

    StringBuilder result = new StringBuilder();

    for (Character character : characters) {
      result.append(character).append(occurency.get(character));
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
