public class Kosiarka extends Maszyna{

    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka, String nazwa, int pojemnoscSilnika, RodzajSilnika rodzajSilnika,
                    boolean czyMelekser, boolean czyNaped, int liczbaOstrzy) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public void wyswietl() {
        System.out.println("Kosiarka " + nazwa  + " marki: "  + marka + ", pojemnosc silnika: " + pojemnoscSilnika +
                ", rodzaj silnika: " + rodzajSilnika + ", czy melekser: " + czyMelekser + ", czy naped: " + czyNaped +
                ", liczba ostrzy: " + liczbaOstrzy);
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }
}
