import java.util.*;

public class Zad1 {

    Zad1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers: ");

        String input = scanner.nextLine();

        String[] numbersStr = input.split(" ");
        int[] numbers = new int[numbersStr.length];

        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        Set<Integer> uniqueNumbers = new TreeSet<>();
        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println(uniqueNumbers);
    }
}
