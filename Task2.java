import java.util.*;

public class Task2 {

    public static void main(String[] args) {


        String aa = "aa";
        String ab = "ab";

        sprawdzCzyUnikalne(aa);
        sprawdzCzyUnikalne(ab);


    }

    private static void sprawdzCzyUnikalne(String string) {

        char[] stringJakoTablicaZnakow = string.toCharArray();
        List stringJakoListaZnakow = new ArrayList();

        for (char el : stringJakoTablicaZnakow){
            stringJakoListaZnakow.add(el);
        }


        Set listaZnakowJakoSet = new HashSet<>();
        //for (Object element : stringJakoListaZnakow){
        //  listaZnakowJakoSet.add(element);
        //  }

        listaZnakowJakoSet.addAll(stringJakoListaZnakow);

        if (stringJakoListaZnakow.size() == listaZnakowJakoSet.size()){
            System.out.println(string + " : unikalne");
        } else {
            System.out.println( string + " : powtarzalne" );
        }
    }
}