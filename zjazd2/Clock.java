//Zaimplementuj klasę `Clock`. Klasa zawierać będzie pola: `hours, minutes, seconds`. Zmienna `hours` przyjmuje wartości
// z zakresu 0-23, `minutes` z zakresu 0-59, `seconds` 0-59.
//Dodaj trzy konstruktor:
//- domyślny - inicjalizuje godzinę 12:00:00;
//- konstruktor zawierający trzy parametry: hours, minutes, seconds,
//- konstruktor z jednym parametrem - czas w sekundach licząc od północy jest konwertowany do pól: `hours, minutes,
// seconds`.
//Dodaj metody:
//- `getHours(), getMinutes(), getSeconds()`, bez parametrów, które zwracają odpowiednie wartości;
//- `setHours(), setMinutes(), setSeconds()`, z jednym parametrem, który ustawia odpowiednie wartości;
//- `tick()`, bez parametrów, która inkrementuje wartość second o jeden. Przykład: wartość 00:00:01 zamieni się na 00:00:02;
// wartość 00:59:59 zmieni się na 01:00:00;
//- `tickDown()`, zmniejsza wartość sekund o jedno; analogiczna do tick();
//- `toString()`, bez parametrów, zwraca reprezentację obiektu w postaci **"[hh-mm-ss]"**, uzupełnioną o nieznaczące
// zera, na przykład: **"[03:12:56]"**.
//Przetestuj zaimplementowany program.

//Szymon Witowski 29099 gr27
public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    Clock() {
        setHours(12);
    };

    Clock(int seconds) {
        int resztaDoMinut = seconds%3600;
        int resztaDoSekund = resztaDoMinut % 60;
        setHours(seconds / 3600);
        setMinutes((resztaDoMinut));
        setSeconds(resztaDoSekund);
    }
    Clock(int seconds, int minutes, int hours) {
        if (seconds >= 0 || seconds < 60)
            throw new IllegalArgumentException("Blad,zakres 0-23");
        else if (minutes >= 0 || minutes < 60)
            throw new IllegalArgumentException("Blad,zakres od 0-59");
        else if (hours >= 0 || hours < 24)
            throw new IllegalArgumentException("Blad,zakres od 0-59");
        setHours(hours);
        setMinutes((minutes));
        setSeconds(seconds);
    }

    public void tick() {
        if (seconds == 59) {
            if (minutes == 59) {
                if (hours == 23) {
                    hours = 0;
                }
                else
                {
                    hours++;
                }
                minutes = 0;
            }
            else
            {
                minutes++;
            }
            seconds = 0;
        }
        else
        {
            seconds++;
        }
    }

    public void tickDown() {
        if (seconds == 0) {
            if (minutes == 0) {
                if (hours == 0) {
                    hours = 23;
                }
                else
                {
                    hours--;
                }
                minutes = 59;
            }
            else
            {
                minutes--;
            }
            seconds = 59;
        }
        else
        {
            seconds--;
        }
    }

    public String toString() {
        return String.format("[%02d:%02d:%02d]", hours, minutes, seconds);
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
