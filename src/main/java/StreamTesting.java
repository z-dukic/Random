import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTesting {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Pero", 100));
        people.add(new Person("Marko", 50));

        Person stevo = new Person();
        stevo.setName("Stevo");
        stevo.setWealth(100);
        people.add(stevo);

        List<Person> hundredClub = people.stream().filter(person -> person.getWealth() >= 20).collect(Collectors.toList());


        for (Person p : people) {
            System.out.println(p);

        }

        System.out.println();

        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(7);
        lista.add(9);

        int suma = 0;
        for (Integer i : lista) {
            suma = suma + i;
        }
        System.out.println(suma);


    }


}
