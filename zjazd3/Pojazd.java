public class Pojazd extends Maszyna {

    protected double moc;
    protected double momentObrotowy;
    protected static int maxLiczbaPojazdow = 1000;
    protected  int nrPojazdu;
    private static int countNrPojazdu = 0;

    public Pojazd(String marka, String nazwa, int pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc,
                  double momentObrotowy) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
        setNrPojazdu();


    }
    public void wyswietl() {
        System.out.println("Pojazd " + nrPojazdu + " z " + maxLiczbaPojazdow + " - marka: " + marka + " nazwa: " + nazwa
                + ", pojemnosc silnika: " + pojemnoscSilnika + ", rodzaj silnika: " + rodzajSilnika +
                ", moc: " + moc + ", moment obrotowy: " + momentObrotowy);
    }

    public void setNrPojazdu() {
        this.nrPojazdu = countNrPojazdu;
        countNrPojazdu+=1;

    }
}
