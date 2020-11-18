import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsInSentence {

  public static void main(String[] args) {
    System.out.println("Type your sentence here:");
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();

    System.out.println("Your sentence [" + s + "] gives this output with List: " + reverseWords(s));
    System.out.println("Your sentence [" + s + "] gives this output with iteration "
        + "and StringBuilder: " + reverseSentence(s));

  }
  // with List.
  public static String reverseWords(String sentence) {
    List<String> words = Arrays.asList(sentence.split("\\s"));
    Collections.reverse(words);
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < words.size(); i++) {
      sb.append(words.get(i));
      sb.append(' ');
    }

    return sb.toString().trim();
  }

  //simple iteration and StringBuilder, no need to convert String to an ArrayList.

  public static String reverseSentence(String sentence) {
    if (sentence.trim().isEmpty()) {
      return sentence;
    }

    StringBuilder reverse = new StringBuilder();
    String[] sa = sentence.trim().split("\\s");

    for (int i = sa.length - 1; i >= 0 ; i--) {
      reverse.append(sa[i]);
      reverse.append(' ');

    }
    return reverse.toString().trim();
  }
}
