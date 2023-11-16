import java.util.Scanner;

public class App {

    public static Order pipes = new Order();
    public static Order oatMilks = new Order();
    public static Order cars = new Order();
    public static Order candies = new Order();

    static void errorMessage() {
        System.out.println("Nu blev något fel! Försök igen.");
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        System.out.println("Hej och välkommen till Multifabriken AB!");
        System.out.println("Hos oss kan du köpa Bilar, Godis, Rör och Havremjölk!");
        while (run == true) {
            System.out.println("Vad vill du göra?");
            System.out.println("A: Köp en bil");
            System.out.println("B: Köp rör");
            System.out.println("C: Köp godis");
            System.out.println("D: Köp havremjölk");
            System.out.println("E: Titta i din kundvagn");
            System.out.println("F: Avsluta och gå hem");

            switch (input.nextLine()) {
                case "A":
                    System.out.println("Vilken modell vill du ha?");
                    String brand = input.nextLine();
                    System.out.println("Vilken färg ska bilen ha?");
                    String color = input.nextLine();
                    System.out.println("Vad ska det stå på registreringsskylten?");
                    String numberPlate = input.nextLine();
                    cars.addItem(color, brand, numberPlate);
                    break;

                case "B":
                    System.out.println("Hur många meter rör vill du ha?");

                    int length;
                    if (input.hasNextInt() && (length = input.nextInt()) > 0) {
                        input.nextLine();
                        System.out.println("Hur stor är diametern? Ange mm:");
                        int diameter;
                        if (input.hasNextInt() && (diameter = input.nextInt()) > 0) {
                            input.nextLine();
                            pipes.addItem(diameter, length);
                            break;

                        } else {
                            errorMessage();
                            break;
                        }

                    } else {
                        errorMessage();
                        break;
                    }

                case "C":
                    System.out.println("Vad ska godiset ha för smak?");
                    String taste = input.nextLine();
                    System.out.println("Hur många godisbitar vill du köpa?");
                    int amount;
                    if (input.hasNextInt() && (amount = input.nextInt()) > 0) {
                        input.nextLine();
                        candies.addItem(taste, amount);
                        break;

                    } else {
                        errorMessage();
                        break;
                    }

                case "D":
                    System.out.println("Hur fet ska havremjölken vara?");
                    double fat;
                    if (input.hasNextDouble() && (fat = input.nextDouble()) > 0) {
                        input.nextLine();
                        System.out.println("Hur många liter vill du köpa");
                        double cubicLiters;
                        if (input.hasNextDouble() && (cubicLiters = input.nextDouble()) > 0) {
                            input.nextLine();
                            oatMilks.addItem(fat, cubicLiters);
                            break;

                        } else {
                            errorMessage();
                            break;
                        }
                    } else {
                        errorMessage();
                        break;
                    }

                case "E":
                    System.out.println("");
                    System.out.println("Du har köpt:");
                    System.out.println("");
                    System.out.println("*********************************************************");
                    System.out.println("Havremjölk:");
                    System.out.println("");
                    for (OatMilk oatMilk : oatMilks.getOatMilks()) {
                        System.out.println();
                        System.out.println(
                                oatMilk.getCubicLiters() + " liter havremjölk som har " + oatMilk.getFat()
                                        + "% fetthalt");
                    }

                    System.out.println("*********************************************************");
                    System.out.println("Godis:");
                    System.out.println("");
                    for (Candy candy : candies.getCandies()) {
                        System.out.println(candy.getAmount() + " godisar som smakar " + candy.getTaste());
                        System.out.println("");
                    }

                    System.out.println("*********************************************************");
                    System.out.println("Rör:");
                    System.out.println("");
                    for (Pipe pipe : pipes.getPipes()) {
                        System.out.println(pipe.getLength() + "m rör med diametern " + pipe.getDiameter() + "mm");
                        System.out.println("");
                    }

                    System.out.println("*********************************************************");
                    System.out.println("Bilar:");
                    System.out.println("");
                    for (Car car : cars.getCars()) {
                        System.out.println("En " + car.getColor() + " " + car.getBrand() + " med registreringsskylten "
                                + car.getNumberPlate());
                        System.out.println("");

                    }
                    System.out.println("*********************************************************");
                    break;

                case "F":
                    System.out.println("Tack för att du har handlat på Multifabriken AB");
                    run = false;
                    break;

                default:
                    errorMessage();
                    System.out.println("");
                    break;
            }
        }
        input.close();
    }
}
