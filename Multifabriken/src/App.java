import java.util.Scanner;

public class App {

    public static Order pipes = new Order();

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
        pipes.addPipe(length, diameter);

        for (Pipe pipe : pipes.getPipes()) {
            System.out.println("Pipes length: " + pipe.getLength());
            System.out.println("Pipes diameter: " + pipe.getDiameter());
        }
    }
}
