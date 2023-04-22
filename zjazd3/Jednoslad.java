public class Jednoslad extends Pojazd {
    private TypJednosladu typ;

    enum TypJednosladu {
        motocykl,
        rower,
        hulajnoga
    }

    public Jednoslad(String marka, String nazwa, int pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc,
                     double momentObrotowy, TypJednosladu typ) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.typ = typ;
    }

    public Jednoslad(String marka, String nazwa, int pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc,
                     double momentObrotowy) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);

    }


    public Jednoslad(String marka, String nazwa,RodzajSilnika rodzajSilnika, TypJednosladu typ) {
        super(marka, nazwa, 0, RodzajSilnika.brak, 0, 0);
        this.marka = marka;
        this.nazwa = nazwa;
        this.rodzajSilnika = rodzajSilnika;
        this.typ = typ;
        setNrPojazdu();
    }

    @Override
    public void wyswietl() {
        String typJednosladu = typ == null ? "" : ", typ: " + typ;
        String markaJednosladu = marka == null ? "" : ", marka: " + marka;
        String nazwaJednosladu = nazwa == null ? "" : ", nazwa: " + nazwa;
        String pojemnoscSilnikaJednosladu = ", pojemnosc silnika: " + pojemnoscSilnika;
        String rodzajSilnikaJednosladu = rodzajSilnika == null ? "" : ", rodzaj silnika: " + rodzajSilnika;
        String mocJednosladu = ", moc: " + moc;
        String momentObrotowyJednosladu = typ == null ? "" : ", moment obrotowy: " + momentObrotowy;

        System.out.println(
                "Jednoslad " + nrPojazdu + " z " + maxLiczbaPojazdow + ": " + markaJednosladu + " " + nazwaJednosladu +
                        ", " + pojemnoscSilnikaJednosladu + ", " + rodzajSilnikaJednosladu +
                        ", " + mocJednosladu + ", " + momentObrotowyJednosladu + typJednosladu);
    }
}