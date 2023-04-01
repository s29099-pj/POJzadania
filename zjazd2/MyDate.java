///**Zadanie 3** *(3 punkty)*
//
//Zaimplementuj klasę `MyDate`, która przechowuje informację: `month` (typu int), `day`(typu int) i `year` (type int).
//Klasa powinna zawierać konstruktor, który inicjalizuje zmienne, sprawdzając poprawność zakresów (day 0-31, month 0-12, year 1990-2050).
//Zaimplementuj methody set i get dla wszystkich pól.
//Dodaj metodę `displayDate`, która wyświetli pola z uwzględnieniem zer nieznaczących oddzielone znakiem "/", np `21/03/2051`.
//Przetestuj zaimplementowaną klasę.

//Szymon Witowski 29099 gr27
public class MyDate {
    private int day;
    private int month;
    private int year;
    MyDate(int day,int month,  int year) {
        if (day >= 31 || day < 0)
            throw new IllegalArgumentException("Blad,zakres od 1 do 31");
        else if (month >= 12 || month < 0)
            throw new IllegalArgumentException("Blad,zakres od 1 do 12");
        else if (year >= 2050 || year < 1990)
            throw new IllegalArgumentException("Blad,zakres od 1990 do 2050");

        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }
}
