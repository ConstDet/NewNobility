import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Peter", "Rumyantsev-Zadunaisky", 298));
        list.add(new Person("Grigory", "Potemkin-Tauride", 284));
        list.add(new Person("Mikhail", "Golenishchev-Kutuzov-Smolensky", 278));
        list.add(new Person("Alexander", "Pushkin", 224));
        list.add(new Person("Sergey", "Vasilyev", 17));
        list.add(new Person("Dmitriy", "Peskov", 12));
        System.out.println(list);
        Predicate<Person> isYounger;
        isYounger = personAge -> personAge.getAge() < 18;
        list.removeIf(isYounger);
        System.out.println(list);
    }
}