// Zadanie 5 (3 punkty) Zaimplementuj klasę Numbers. Dodaj konstruktor który przyjmuje trzy liczby typu integer. Dodaj metody:
// sum(), zwraca sumę liczb;
// average(), zwraca średnią arytmetyczną liczb;
// min(), zwraca najmniejszą z liczb;
// max(), zwraca największą z liczb;
// geometric(), zwraca średnią geometryczną liczb; Przetestuj zaimplementowany program.

//Szymon Witowski 29099 gr27
public class Numbers {

    private int numer1;
    private int numer2;
    private int numer3;

    Numbers(int numer1, int numer2, int numer3) {
        this.numer1 = numer1;
        this.numer2 = numer2;
        this.numer3 = numer3;

    }

    public int sum() {
        return this.numer1 + this.numer2 + this.numer3;
    }

    public double average() {
        return sum() / 3;
    }

    public int min() {
        return Math.min(Math.min(this.numer1, this.numer2), this.numer3);
    }

    public int max() {
        return Math.max(Math.max(this.numer1, this.numer2), this.numer3);
    }

    public double geometric() {
        return Math.cbrt(this.numer1 * this.numer2 * this.numer3);
    }

}