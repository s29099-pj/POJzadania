//Zaimplementuj klasę Student, do przechowywania imienia, nazwiska, numer indeksu i obecność (wyrażonej w procentach)
// oceny z POJ (typu int). Jeżeli podczas tworzenia obiektu nie zostało przekazane imię i nazwisko, pola powinny być
// ustawione wartością "Unknown". Dodaj odpowiednie metody set i get do wszystkich pól klasy. Jeżeli obecnocność jest
// mniejsza niż 50%, student powinien otrzymać ocenę 2. Przetestuj program, tworząc trzy różne obiekty klasy Student.

//Szymon Witowski 29099 gr27
public class Student {
    private String imie;
    private String nazwisko;
    private int nr_indeksu;
    double obecnosc;
    int ocena;


    Student(String imie, String nazwisko, int numerIndexu, double obecnosc, int ocena) {
        setImie(imie);
        setNazwisko(nazwisko);
        setNr_indeksu(numerIndexu);
        setObecnosc(obecnosc);
        if (obecnosc < 50)
            setOcena(2);
        setOcena(ocena);
    }
    Student(int numerIndexu, double obecnosc, int ocenyaZPoj) {
        setImie("Unknown");
        setNazwisko("Unknown");
        setNr_indeksu(numerIndexu);
        setObecnosc(obecnosc);
        if (obecnosc < 50)
            setOcena(2);
        setOcena(ocena);
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public void setObecnosc(double obecnosc) {
        this.obecnosc = obecnosc;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getObecnosc() {
        return obecnosc;
    }

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public int getOcena() {
        return ocena;
    }
}
