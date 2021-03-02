import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;

        System.out.println("Please enter your name or just press Enter: ");
        name = input.nextLine();

        if (name.length()==0)
            System.out.println("Hello, stranger!");
        else
            System.out.println("Hello, " + name + "!");
    }
}
