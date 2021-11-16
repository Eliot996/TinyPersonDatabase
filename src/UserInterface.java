import java.util.Scanner;

public class UserInterface {
    Scanner input = new Scanner(System.in);

    // print hello message to the user
    public void hello() {
        System.out.println("Hello, in this program you can create and modify a list of persons");
    }

    // print the menu
    public void printMenu(){
        System.out.println("""
                1. Print people in list
                2. Add person to list
                3. Delete person from list
                0. Exit program
                """);
    }

    // get int from user, try again if the user did not input an int
    public int getInt(){
        if (input.hasNextInt()){
            int i = input.nextInt();
            input.nextLine(); // to prevent scanner bug
            return i;
        }else{
            System.out.print("Please enter an int:");
            return getInt();
        }
    }

    public String getString(){
        return input.nextLine();
    }

    public void printToUser(String string) {
        System.out.println(string);
    }
}
