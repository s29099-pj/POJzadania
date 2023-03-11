import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args)    {

        zadanie10();

    }
    public static void zadanie1()    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok: ");
        int a = reader.nextInt();
        System.out.println("Podaj drugi bok: ");
        int b = reader.nextInt();
        reader.close();
        System.out.println("Wynik zadania 1: " + a*b);
    }
    public static void zadanie2()    {
        double a = Math.PI;
        System.out.format("value is %.2f",sqrt(a));
    }
    public static void zadanie3()
    {
        System.out.println("Podaj 2 ciagi znakow:");
        Scanner reader = new Scanner(System.in);
        String ciag = reader.nextLine();
        reader.close();
        String[] wynik = ciag.split(" ");
        System.out.format("\"%%%1$s %2$s%%\"", wynik[1], wynik[0]);
    }
    public static void zadanie4()    {
        System.out.println("Podaj 3 boki trojkata:");
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        reader.close();
        if (a+b>c && a+c>b && b+c>a){
            System.out.println("TAK");
        }
        else{
            System.out.println("NIE");
        }
    }
    public static void zadanie5() {
        System.out.println("Podaj numer miesiaca(1-12):");
        Scanner reader = new Scanner(System.in);
        int miesiac = reader.nextInt();
        reader.close();
        switch (miesiac) {
            case 1:
                System.out.println("Styczen 31 dni");
                break;
            case 2:
                System.out.println("Luty 28 dni");
                break;
            case 3:
                System.out.println("Marzec 31 dni");
                break;
            case 4:
                System.out.println("Kwiecien 30 dni");
                break;
            case 5:
                System.out.println("Maj 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec 30 dni");
                break;
            case 7:
                System.out.println("Lipiec 31 dni");
                break;
            case 8:
                System.out.println("Sierpien 31 dni");
                break;
            case 9:
                System.out.println("Wrzesien 30 dni");
                break;
            case 10:
                System.out.println("Pazdziernik 31 dni");
                break;
            case 11:
                System.out.println("Listopad 30 dni");
                break;
            case 12:
                System.out.println("Grudzien 31 dni");
                break;
            default:
               System.out.println("BLAD!");
        }
    }

    public static void zadanie6()    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        float a = reader.nextFloat();
        System.out.println("Podaj druga liczbe : ");
        float b = reader.nextFloat();
        System.out.println("Podaj trzecia liczbe : ");
        float c = reader.nextFloat();
        reader.close();

        System.out.println("Wynik zadania 6: ");
        float[] wyjscie  = new float[3];
        if ((a > b) && (a > c)){
            wyjscie[0] = a;
            if (b > c) {
                wyjscie[1] = b;
                wyjscie[2] = c;
            }
            else {
                wyjscie[1] = c;
                wyjscie[2] = b;
            }
        }
        if ((b > a) && (b > c)) {
            wyjscie[0] = b;
            if (a > c) {
                wyjscie[1] = a;
                wyjscie[2] = c;
            }
            else {
                wyjscie[1] = c;
                wyjscie[2] = a;
            }
        }
        else {
            wyjscie[0] = c;
            if(a > b){
                wyjscie[1] =a;
                wyjscie[2] = b;
            }
            else {
                wyjscie[1] =b;
                wyjscie[2] =a;
            }
        }
        System.out.println(wyjscie[0]+" "+wyjscie[1]+" "+wyjscie[2]+
                " "+wyjscie[2]+" "+wyjscie[1]+" "+wyjscie[0]+" ");
    }
    public static void zadanie7()    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Podaj liczbe elementow tablicy A: ");
        int n = reader.nextInt();
        System.out.print("Podaj liczbe elementow tablicy B: ");
        int m = reader.nextInt();

        int[] A = new int[n];
        int[] B = new int[m];
        System.out.println("Liczby w tablicy A: ");
        for (int i = 0; i < n; i++) {
            A[i] = reader.nextInt();
        }
        System.out.println("Liczby w tablicy B: ");
        for (int i = 0; i < m; i++) {
            B[i] = reader.nextInt();
        }

        int iloczynSkalarny = 0;
        int mniejszyRozmiar = Math.min(n, m);
        for (int i = 0; i < mniejszyRozmiar; i++) {
            iloczynSkalarny += A[i] * B[i];
        }
        reader.close();

        System.out.println("Wynik zadania 7: " + iloczynSkalarny);
    }
    public static void zadanie8()    {
        Scanner reader = new Scanner(System.in);
        int n;
        System.out.print("Podaj liczbę ");
        n = reader.nextInt();
        reader.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void zadanie9()    {
        Scanner reader = new Scanner(System.in);
        String slowo;
        System.out.print("Podaj slowo: ");
        slowo = reader.nextLine();
        reader.close();
        int length = slowo.length();
        for (int i = 0; i < slowo.length() / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(slowo.length() - i - 1)) {
                System.out.println("nie");
                break;
            }
        }
        System.out.println("tak");
    }
    public static void zadanie10() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy: ");
        int rows = reader.nextInt();
        System.out.print("Podaj liczbę kolumn: ");
        int cols = reader.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Podaj elementy tablicy:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = reader.nextInt();
            }
        }

        System.out.println("Transpozycja macierzy:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        reader.close();
    }
}
