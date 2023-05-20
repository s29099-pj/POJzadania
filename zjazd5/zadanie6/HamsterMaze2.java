package zadanie6;
import java.util.*;

//zadanie 6
public class HamsterMaze2  {
    public static void main(String[] args) {
        List<Hamster2> v = new ArrayList<Hamster2>();

        Scanner scanner = new Scanner(System.in);
        Map<String, Hamster2> hamstersMap = new HashMap<>();

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

                Hamster2 hamster = new Hamster2(id, name);
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
        //usuwanie
        removeHamster(v,5);

        //przed i po posortowaniu
        Printer2.printAll(v);

        Collections.sort(v);
        System.out.println("After sorting:");
        Printer2.printAll(v);


    }

    public static void removeHamster(List<Hamster2> hl, int id) {
        Iterator<Hamster2> iterator = hl.iterator();

        while (iterator.hasNext()) {
            Hamster2 hamster2 = iterator.next();
            if (hamster2.getHamsterNumber() == id) {
                iterator.remove();
                break;
            }

        }
    }
}

class Hamster2 implements Comparable<Hamster2> {
    private int hamsterNumber;
    private String name;

    Hamster2(int i, String name) {
        this.hamsterNumber = i;
        this.name = name;
    }

    @Override
    public int compareTo(Hamster2 obj2) {
        return Integer.compare(this.hamsterNumber, obj2.hamsterNumber);
    }

    public String hamsterNumber() {
        return "This is Hamster #" + hamsterNumber + " named: " + name;
    }

    public int getHamsterNumber() {
        return hamsterNumber;
    }
}
class Printer2 {
    static void printAll(List<Hamster2> hl) {
        Iterator<Hamster2> iterator = hl.iterator();
        while (iterator.hasNext()) {
            Hamster2 hamster = iterator.next();
            System.out.println(hamster.hamsterNumber());
        }
    }
}
