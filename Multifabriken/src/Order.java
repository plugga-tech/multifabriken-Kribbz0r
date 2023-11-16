import java.util.ArrayList;

public class Order {

    private ArrayList<Candy> candies = new ArrayList<>();

    private ArrayList<Car> cars = new ArrayList<>();

    private ArrayList<Pipe> pipes = new ArrayList<>();

    private ArrayList<OatMilk> oatMilks = new ArrayList<>();

    Order() {

    }

    public void addItem(int diameter, int length) {
        pipes.add(new Pipe(diameter, length));
    }

    public void addItem(double diameter, double length) {
        oatMilks.add(new OatMilk(diameter, length));
    }

    public void addItem(String color, String numberPlate, String brand) {
        cars.add(new Car(color, numberPlate, brand));
    }

    public void addItem(String taste, int amount) {
        candies.add(new Candy(taste, amount));
    }

    public ArrayList<Candy> getCandies() {
        return candies;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public ArrayList<Pipe> getPipes() {
        return pipes;
    }

    public ArrayList<OatMilk> getOatMilks() {
        return oatMilks;
    }

}
