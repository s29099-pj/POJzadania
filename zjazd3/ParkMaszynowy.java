import java.util.ArrayList;
import java.util.List;
public class ParkMaszynowy {


    ParkMaszynowy(){
        //List<> listaMaszyn = new ArrayList<>();

        Lokomotywa lok1 = new Lokomotywa("naz","Super Lokomotywa",2000, Maszyna.RodzajSilnika.elektryczny, "czerwony",2500);
        Lokomotywa lok2 = new Lokomotywa("naz2","Super Lokomotywa2",2500, Maszyna.RodzajSilnika.spalinowy, "czarny",6600);
        lok1.wyswietl();

        Samochod sam1 = new Samochod("mar1","naz1",500,Maszyna.RodzajSilnika.elektryczny,50,50, Samochod.Segment.A,"55555");
        Samochod sam2 = new Samochod("mar2","naz2",500,Maszyna.RodzajSilnika.spalinowy,50,50, Samochod.Segment.A,"55555");
        lok1.wyswietl();

        Jednoslad jed1 = new Jednoslad("mark","moto",50,Maszyna.RodzajSilnika.spalinowy,50,50, Jednoslad.TypJednosladu.motocykl);
        Jednoslad jed2 = new Jednoslad("mark","rower",Maszyna.RodzajSilnika.brak, Jednoslad.TypJednosladu.rower);
        lok1.wyswietl();

    }
}
