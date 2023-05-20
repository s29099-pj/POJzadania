import java.util.*;
public class Zad2 {

    Zad2() {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");

        for (String s : input1) {
            set1.add(Integer.parseInt(s));
        }

        for (String s : input2) {
            set2.add(Integer.parseInt(s));
        }

        Set<Integer> output = new HashSet<>(set1);
        output.retainAll(set2);

        System.out.println(output);
    }
}