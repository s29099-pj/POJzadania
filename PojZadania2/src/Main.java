//Szymon Witowski s29099 zjazd2 POJ gr27
//zadanie1 - klasa Card
//zadanie2 - klasa Student
//zadanie3 - klasa MyDate
//zadanie4 - klasa CLock
//zadanie5 - klasa Numbers
public class Main {
    public static void main(String[] args) {

        //zadanie 1
        Card kier7 = new Card(7,Card.Kolor.kier);
        Card trefl2 = new Card(2,Card.Kolor.trefl);
        Card pik9 = new Card(9,Card.Kolor.pik);
        //zadanie 2
        Student student = new Student("Piotr","Bog",28654,0.13,5);
        Student student2 = new Student(29454,0.13,5);
        Student student3 = new Student("Maciej","Lew",224,0.13,5);
        //zadanie 3
        MyDate data1 = new MyDate(3,8,1999);
        MyDate data2 = new MyDate(3,8,2009);
        data1.displayDate();
        data2.displayDate();
        //zadanie 4
        Clock zegar1 = new Clock(3701);
        System.out.println(zegar1.toString());
        //zadanie 5
        Numbers liczby1 = new Numbers(5,6,7);
    }

}