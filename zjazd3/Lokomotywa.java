public class Lokomotywa extends Maszyna {

    private String kolor;
    private int mocSilnika;



    Lokomotywa(String marka, String nazwa, int pojemnoscSilnika, RodzajSilnika rodzajSilnika, String kolor,int mocSilnika){
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
        this.kolor = kolor;
        this.mocSilnika = mocSilnika;

    }

    public void wyswietl() {
        System.out.println("Lokomotywa " + marka + " " + nazwa + ", pojemnosc silnika: " + pojemnoscSilnika +
                ", rodzaj silnika: " + rodzajSilnika + ", kolor: " + kolor + ", moc silnika: "
                + mocSilnika);
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setMocSilnika(int konieMmechaniczne) {
        this.mocSilnika = mocSilnika;
    }

}
