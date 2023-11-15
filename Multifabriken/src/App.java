import java.util.Scanner;

public class App {
    public static Order orderItems = new Order();

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // method that lists what can be ordered.

        // list the avalible options för the user.

        // Create switch to see what the user wants to do. Check for int 1-6.
        // option 1, create car method
        // option 2, create candy method
        // option 3, create pipes method
        // option 4, create oat milk method
        // option 5, print what the user has ordered.
        // option 6, exit the app

        int length = input.nextInt();
        int diameter = input.nextInt();
        Order.pipes.add(new Pipe(length, diameter));

        for (int i = 0; i < Order.pipes.size(); i++)
            System.out.println("Pipes: " + Order.pipes.get(i));
    }
}
