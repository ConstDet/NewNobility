import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        String[] strArray1 = p1.getSurname().split("-");
        String[] strArray2 = p2.getSurname().split("-");
        if (strArray1.length > strArray2.length) {
            return 1;
        } else if (strArray1.length < strArray2.length) {
            return -1;
        } else {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }
}
