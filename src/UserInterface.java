import java.util.Scanner;

public class UserInterface {
    Scanner input = new Scanner(System.in);

    public void hello() {
        System.out.println("Hello, in this program you can create and modify a list of persons");
    }

    public void printMenu(){
        System.out.println("""
                1. Print people in list
                2. Add person to list
                3. delete person from list
                0. Exit program
                """);
    }

    public int getInt(){
        if (input.hasNextInt()){
            return input.nextInt();
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
