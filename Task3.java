import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

    public static void main(String[] args) {

        List<String> lista= new ArrayList<>();
        lista.add("aa");
        lista.add("ab");
        lista.add("aa");
        lista.add("ac");


        List<String> bezDuplikatow = distinct(lista);

        System.out.println(bezDuplikatow);

    }

    private static  List<String> distinct (List<String> lista) {
        List<String> bezDuplikatow = new ArrayList<>();

        Set<String> set = new HashSet<>(lista);
        bezDuplikatow.addAll(set);

        return bezDuplikatow;
    }


}
