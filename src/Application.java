import java.util.ArrayList;

public class Application {

    private final ArrayList<Person> people = new ArrayList<>();
    private final UserInterface ui = new UserInterface();

    // the main controller of the application
    public void activate() {
        // print hello message to the user
        ui.hello();

        // boolean to control the while loop
        boolean keepGoing = true;

        while (keepGoing) {
            //print the menu to the user
            ui.printMenu();

            // get the menu choice from the user
            int choice = ui.getInt();

            switch (choice) {
                case 1 -> printAllPeople();
                case 2 -> addPerson();
                case 3 -> deletePerson();
                case 0 -> keepGoing = false;
            }
        }
    }

    // the method firsts sorts the list of people, then compiles the list to a StringBuilder
    // and then prints it to the user
    private void printAllPeople() {
        // Sort list of people
        people.sort(Person::compareTo);

        // add people to the stringbuilder
        StringBuilder sb = new StringBuilder("The list of people: \n");
        for (int i = 0; i < people.size(); i++) {
            sb.append(i).append(". ").append(people.get(i)).append('\n');
        }

        // print to the user
        ui.printToUser(sb.toString());
    }

    // method to create and add a person to the list of people
    public void addPerson() {
        // get firstname from user
        ui.printToUser("Enter firstname: ");
        String firstName = ui.getString();

        // get lastname from user
        ui.printToUser("Enter lastname: ");
        String lastName = ui.getString();

        // create and add the person to the list of people
        people.add(new Person(firstName, lastName));

        // print a completion message ot hte user
        ui.printToUser(people.get(people.size() - 1) + " was added");
    }

    // method to delete a person based on the position in the list of people
    public void deletePerson() {

        // print all the people
        printAllPeople();

        // get the index of the person to delete
        ui.printToUser("Please enter the number of the person to remove: ");
        int choice = ui.getInt();

        // remove the person at the given index
        people.remove(choice);

        // print a completion message
        ui.printToUser("The person on index " + choice + " was removed");
    }


    public static void main(String[] args) { new Application().activate(); }
}
