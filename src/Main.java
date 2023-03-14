import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Peter", "Rumyantsev-Zadunaisky", 298));
        list.add(new Person("Grigory", "Potemkin-Tauride", 284));
        list.add(new Person("Mikhail", "Golenishchev-Kutuzov-Smolensky", 278));
        list.add(new Person("Alexander", "Pushkin", 224));
        System.out.println(list);
        int countWord = 2;
        Comparator<Person> comparator = (p1, p2) -> {
            String[] strArray1 = p1.getSurname().split("-");
            String[] strArray2 = p2.getSurname().split("-");
            if (!(strArray1.length <= countWord && strArray2.length <= countWord)) {
                if (strArray1.length > strArray2.length) {
                    return 1;
                } else if (strArray1.length < strArray2.length) {
                    return -1;
                }
            }
            return Integer.compare(p1.getAge(), p2.getAge());
        };
        Collections.sort(list, comparator);
        System.out.println(list);
    }
}