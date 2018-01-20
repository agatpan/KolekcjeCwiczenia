public class PozycjaNaPolce {

    private String sekcja;
    private int numer;

    public PozycjaNaPolce(String sekcja, int numer) {
        this.sekcja = sekcja;
        this.numer = numer;
    }


    @Override
    public String toString() {
        return "PozycjaNaPolce {" +
                "sekcja = '" + sekcja + '\'' +
                ", numer = " + numer +
                '}';
    }
}
