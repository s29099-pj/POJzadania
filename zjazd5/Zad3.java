import java.util.*;

public class Zad3 {
    Zad3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type Input: ");
        String input = scanner.nextLine();

        Map<String, Integer> wordCount = new TreeMap<>();
        String[] words = input.split(" ");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
        }

        System.out.println(wordCount);
    }
}