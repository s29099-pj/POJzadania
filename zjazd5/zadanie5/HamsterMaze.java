package zadanie5;
import java.util.*;
public class HamsterMaze {
    public static void main(String[] args) {
        List<Hamster> v = new ArrayList<Hamster>();

        Scanner scanner = new Scanner(System.in);
        Map<String, Hamster> hamstersMap = new HashMap<>();

        while (true) {
            try {
                System.out.print("Enter Hamster ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Hamster Name: ");
                String name = scanner.nextLine();

                if (id < 0) {
                    throw new IllegalArgumentException("Incorrect input. Id cant be negative");
                }

                Hamster hamster = new Hamster(id, name);
                v.add(hamster);
                hamstersMap.put(name, hamster);

                System.out.println("Added hamster: " + hamster.hamsterNumber());
            } catch (InputMismatchException e) {
                System.out.println("Incorect Hamsater ID.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect input: " + e.getMessage());
            }

            System.out.print("Do you want to add another hamster? (Y/N): ");
            String choice = scanner.nextLine().trim().toUpperCase();

            if (choice.equals("N")) {
                break;
            }
        }
        Printer.printAll(v);

        System.out.println("Przeglądanie odwzorowania:");

        // nie mam ostaniego z zadania 5
    }
}

class Hamster {
    private int hamsterNumber;
    private String name;

    Hamster(int i, String name) {
        this.hamsterNumber = i;
        this.name = name;
    }

    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber + " named: " + name;
    }
}
class Printer {
    static void printAll(List<zadanie5.Hamster> hl) {
        for (zadanie5.Hamster hamster : hl) {
            System.out.println(hamster.hamsterNumber());
        }
    }
}
