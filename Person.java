import java.util.HashMap;
import java.util.Map;

public class Person implements Comparable {

    private String name;
    private String surname;
    private String pesel;

    public Person (String name, String surname, String pesel){
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;

        int wynikPorownaniaStringowAlfabet = surname.compareTo(p.getSurname());

        return wynikPorownaniaStringowAlfabet;

            }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}



