import java.util.*;


public class Task4 {

    public static void main(String[] args) {

        Person osoba1 = new Person("Karol","Kowalski","11111111116");
        Person osoba2 = new Person("Agata", "Pan", "83010100000");
        Person osoba3 = new Person("Ja", "Happy", "12210200000");
        Person osoba4 = new Person("Ty", "Happy", "80110200000");

        Map<String, Person> people = new HashMap<>();

        people.put(osoba1.getPesel(), osoba1);
        people.put(osoba2.getPesel(), osoba2);
        people.put(osoba3.getPesel(), osoba3);
        people.put(osoba4.getPesel(), osoba4);

        System.out.println(people.keySet());



        Collection<Person> osoby = people.values();

        TreeSet<Person> posortowanaMapaPeople = new TreeSet<>();

        for (Person osobaZMapy : osoby){
            posortowanaMapaPeople.add(osobaZMapy);

        }

        System.out.println(posortowanaMapaPeople);


        List<Person> osobyJakoLista = new ArrayList<>(osoby);
        System.out.println(osobyJakoLista);
        Collections.sort(osobyJakoLista);
        System.out.println(osobyJakoLista);



    }
}
