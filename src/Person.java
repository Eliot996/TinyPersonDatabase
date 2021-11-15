public class Person implements Comparable{

    private String firstName;
    private String lastName;

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
        return 0;
    }
}
