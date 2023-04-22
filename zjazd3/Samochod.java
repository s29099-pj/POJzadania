public class Samochod extends Pojazd {
    private Segment segment;
    private String VIN;
    enum Segment {
        A,
        B,
        C,
        D,
        E,
        F,
        S,
        H,
        J,
        M
    }

    public Samochod(String marka, String nazwa, int pojemnoscSilnika, RodzajSilnika rodzajSilnika, double moc,
                    double momentObrotowy, Segment segment, String VIN) {
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, moc, momentObrotowy);
        this.segment = segment;
        this.VIN = VIN;
    }

    @Override
    public void wyswietl() {
        System.out.println("Samochod " + nrPojazdu + " z " + maxLiczbaPojazdow + " - marka: " + marka +
                " nazwa: " + nazwa + ", pojemnosc silnika: " + pojemnoscSilnika +
                ", rodzaj silnika: " + rodzajSilnika +
                ", moc: " + moc + ", moment obrotowy: " + momentObrotowy +
                ", segment: " + segment + ", VIN: " + VIN);
    }
}
