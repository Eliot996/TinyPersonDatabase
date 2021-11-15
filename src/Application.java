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
        StringBuilder sb = new StringBuilder("The list of people: \n");

        for (int i = 0; i < people.size(); i++) {
            sb.append(i).append(". ").append(people.get(i)).append('\n');
        }

        ui.printToUser(sb.toString());
    }

    public void addPerson() {

    }

    public void deletePerson() {

    }

    public static void main(String[] args) {
        Application app = new Application();
        app.activate();
    }
}
