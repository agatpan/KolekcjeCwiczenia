public class Book implements Comparable {

    private String tytul;
    private String imieAutora;
    private String nazwiskoAutora;
    private String rokWydania;
    private String wydawnictwo;

    public Book(String tytul, String imieAutora, String nazwiskoAutora, String rokWydania, String wydawnictwo) {
        this.tytul = tytul;
        this.imieAutora = imieAutora;
        this.nazwiskoAutora = nazwiskoAutora;
        this.rokWydania = rokWydania;
        this.wydawnictwo = wydawnictwo;
    }

    public String getTytul() {
        return tytul;
    }

    public String getImieAutora() {
        return imieAutora;
    }

    public String getNazwiskoAutora() {
        return nazwiskoAutora;
    }

    public String getRokWydania() {
        return rokWydania;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    @Override
    public String toString() {
        return "Book {" +
                "tytul = '" + tytul + '\'' +
                ", imieAutora = '" + imieAutora + '\'' +
                ", nazwiskoAutora = '" + nazwiskoAutora + '\'' +
                ", rokWydania = '" + rokWydania + '\'' +
                ", wydawnictwo = '" + wydawnictwo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Book b = (Book) o;

        int wynikPorownania = nazwiskoAutora.compareTo(b.getNazwiskoAutora());
        return wynikPorownania;
    }
}
