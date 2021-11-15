public class Person implements Comparable{

    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return lastName + ' ' + firstName;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return this.lastName.compareTo(p.lastName);
    }
}
