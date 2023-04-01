//Zadanie 1 (1 punkt)
//
//Zaimplementuj klasę Card reprezentującą pojedynczą kartę do gry z talii kart. Klasa powinna przechowywać wartość
// i kolor: kier, karo, pik, trefl. W zadaniu użyj typu wyliczeniowego. Napisz program testujący,
// który stworzy trzy różne obiekty klasy Card.

//Szymon Witowski 29099 gr27
public class Card {
    public enum Kolor {
        kier,
        karo,
        pik,
        trefl
    }
    int wartosc;
    Kolor kolor;
    public Card(int wartosc,Kolor kolor) {
        this.kolor = kolor;
        this.wartosc =  wartosc;
    }

}
