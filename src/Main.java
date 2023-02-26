import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Peter", "Rumyantsev-Zadunaisky", 298));
        list.add(new Person("Grigory", "Potemkin-Tauride", 284));
        list.add(new Person("Mikhail", "Golenishchev-Kutuzov-Smolensky", 278));
        list.add(new Person("Alexander", "Pushkin", 224));
        System.out.println(list);
        Collections.sort(list, new PersonComparator());
        System.out.println(list);
    }
}