import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int countWord;
    public PersonComparator(int countWord) {
        this.countWord = countWord;
    }
    @Override
    public int compare(Person p1, Person p2) {
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
    }
}
