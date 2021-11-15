import java.util.ArrayList;

public class Application {

    private final  ArrayList<Person> people =  new ArrayList<>();
    private final UserInterface ui = new UserInterface();

    public void activate() {
        ui.hello();

        boolean keepGoing = true;

        while (keepGoing){
            ui.printMenu();
            int choice = ui.getInt();

            switch (choice){
                case 1 -> printAllPeople();
                case 2 -> addPerson();
                case 3 -> deletePerson();
                case 0 -> keepGoing = false;
            }
        }
    }

    private void printAllPeople() {
        // Sort list of people
        people.sort(Person::compareTo);

        StringBuilder sb = new StringBuilder("The list of people: \n");

        for (int i = 0; i < people.size(); i++) {
            sb.append(i).append(". ").append(people.get(i)).append('\n');
        }

        ui.printToUser(sb.toString());
    }

    public void addPerson() {
        ui.printToUser("Enter firstname: ");
        String firstName = ui.getString();

        ui.printToUser("Enter lastname: ");
        String lastName = ui.getString();

        people.add(new Person(firstName, lastName));

        ui.printToUser(people.get(people.size()-1) + " was added");
    }

    public void deletePerson() {

        printAllPeople();

        ui.printToUser("Please enter the number of the person to remove: ");

        int choice = ui.getInt();

        people.remove(choice);

        ui.printToUser("The person on index " + choice + " was removed");
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.activate();
    }
}
