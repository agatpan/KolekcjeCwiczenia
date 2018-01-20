import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Task5 {

    public static void main(String[] args) {

        Book book3 = new Book("Maria Curie", "Ewa", "Curie", "1974", "BlaBla");
        Book book4 = new Book("Star Wars", "Xxxx", "ZZZ", "2010", "ZXC");
        Book book1 = new Book("Java - podstawy", "ghj", "Kret", "2015", "HMB");


        PozycjaNaPolce pozycjaNaPolce1 = new PozycjaNaPolce("Naukowe", 1);
        PozycjaNaPolce pozycjaNaPolce2 = new PozycjaNaPolce("Poradniki", 2);
        PozycjaNaPolce pozycjaNaPolce3 = new PozycjaNaPolce("Biografie", 3);
        PozycjaNaPolce pozycjaNaPolce4 = new PozycjaNaPolce("Fantastyka", 4);

        Map<PozycjaNaPolce, Book> biblioteka = new HashMap<>();
        biblioteka.put(pozycjaNaPolce1, book1);
        biblioteka.put(pozycjaNaPolce3, book3);
        biblioteka.put(pozycjaNaPolce4, book4);

        System.out.println(biblioteka.keySet());

        Collection<Book> Ksiazki = biblioteka.values();

        TreeSet<Book> posortowaneKsiazki = new TreeSet<>();
        for (Book ksiazka : Ksiazki){
            posortowaneKsiazki.add(ksiazka);

        }

        System.out.println(posortowaneKsiazki);


    }
}
