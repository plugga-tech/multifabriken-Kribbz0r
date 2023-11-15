import java.util.Scanner;

public class App {

    public static Order pipes = new Order();
    public static Order oatMilks = new Order();
    public static Order cars = new Order();
    public static Order candies = new Order();

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean run = true;

        while (run == true) {
            // method that lists what can be ordered.
            System.out.println("Hej och välkommen till Multifabriken AB!");
            System.out.println("Hos oss kan du köpa Bilar, Godis, Rör och Havremjölk!");
            System.out.println("A: Köp en bil");
            System.out.println("B: Köp rör");
            System.out.println("C: Köp godis");
            System.out.println("D: Köp havremjölk");
            System.out.println("E: Avsluta och gå hem");

            // list the avalible options för the user.
            switch (input.nextLine()) {
                case "A":
                    System.out.println("Vilken modell vill du ha?");
                    String brand = input.nextLine();
                    System.out.println("Vilken färg ska bilen ha?");
                    String color = input.nextLine();
                    System.out.println("Vad ska det stå på registreringsskylten?");
                    String numberPlate = input.nextLine();
                    cars.addItem(color, brand, numberPlate);

                    // Testing
                    for (Car car : cars.getCars()) {
                        System.out.println("Brand: " + car.getBrand());
                        System.out.println("Colour: " + car.getColor());
                        System.out.println("Number plate: " + car.getNumberPlate());
                    }
                    break;

                case "B":
                    System.out.println("Hur många meter rör vill du ha?");
                    int length = input.nextInt();
                    System.out.println("Hur stor är diametern? Ange mm:");
                    int diameter = input.nextInt();
                    pipes.addItem(diameter, length);

                    // Testing
                    for (Pipe pipe : pipes.getPipes()) {
                        System.out.println("Pipes length: " + pipe.getLength());
                        System.out.println("Pipes diameter: " + pipe.getDiameter());
                    }
                    break;

                case "C":
                    System.out.println("Vad ska godiset ha för smak?");
                    String taste = input.nextLine();
                    System.out.println("Hur många godisbitar vill du köpa?");
                    int amount = input.nextInt();
                    candies.addItem(taste, amount);

                    // Testing
                    for (Candy candy : candies.getCandies()) {
                        System.out.println("Candy taste: " + candy.getTaste());
                        System.out.println("Candy amount: " + candy.getAmount());
                    }

                    break;

                case "D":
                    System.out.println("Hur fet ska havremjölken vara?");
                    int fat = input.nextInt();
                    System.out.println("Hur många liter vill du köpa");
                    double cubicLiters = input.nextDouble();
                    oatMilks.addItem(fat, cubicLiters);

                    // Testing
                    for (OatMilk oatMilk : oatMilks.getOatMilks()) {
                        System.out.println("OatMilk Fat: " + oatMilk.getFat());
                        System.out.println("OatMilk liters: " + oatMilk.getCubicLiters());
                    }
                    break;

                case "E":
                    System.out.println("Tack för att du har handlat på Multifabriken AB");
                    run = false;
                    break;

                default:
                    System.out.println("Nu blev något fel. Försök igen!");
                    break;
            }
            // Create switch to see what the user wants to do. Check for int 1-6.
            // option 1, create car method
            // option 2, create candy method
            // option 3, create pipes method
            // option 4, create oat milk method
            // option 5, print what the user has ordered.
            // option 6, exit the app

        }
        // int length = input.nextInt();
        // int diameter = input.nextInt();
        // pipes.addItem(length, diameter);
        // int length2 = 6;
        // int diameter2 = 7;
        // pipes.addItem(diameter2, length2);

        // String color = "red";
        // String brand = "volvo";
        // String numberPlate = "KDP 111";
        // cars.addItem(color, brand, numberPlate);

        // for (Pipe pipe : pipes.getPipes()) {
        // System.out.println("Pipes length: " + pipe.getLength());
        // System.out.println("Pipes diameter: " + pipe.getDiameter());
        // }
        // for (Car car : cars.getCars()) {
        // System.out.println("Brand: " + car.getBrand());
        // System.out.println("Colour: " + car.getColor());
        // System.out.println("Number plate: " + car.getNumberPlate());
        // }
        input.close();
    }
}
