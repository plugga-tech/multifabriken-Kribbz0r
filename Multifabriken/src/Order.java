import java.util.ArrayList;

public class Order {

    // all lists that can store things. Find out if its doable in one list later.
    // static ArrayList<Candy> candies = new ArrayList<>();
    // static ArrayList<Car> cars = new ArrayList<>();
    // static ArrayList<Pipe> pipes = new ArrayList<>();
    // static ArrayList<OatMilk> oatMilks = new ArrayList<>();

    private ArrayList<Order> orderItems = new ArrayList<>();

    Order() {

    }

    public void addCandy(int amount, String taste) {
        orderItems.add(amount, taste);
    }

    public void addCar(String color, String brand, String numberPlate) {
        orderItems.add(color, brand, numberPlate);
    }

    public void addPipe(int diameter, int length) {
        orderItems.add(new Pipe(diameter, length));
    }

    public void addOatMilk(int fat, double cubicLiters) {
        orderItems.add(new OatMilk(fat, cubicLiters));
    }

    // public ArrayList<Car> getCars() {
    // return cars;
    // }

    // public void setCars(ArrayList<Car> cars) {
    // this.cars = cars;
    // }

    // public ArrayList<Pipe> getPipes() {
    // return pipes;
    // }

    // public void setPipes(ArrayList<Pipe> pipes) {
    // this.pipes = pipes;
    // }

    // public ArrayList<OatMilk> getOatMilks() {
    // return oatMilks;
    // }

    // public void setOatMilks(ArrayList<OatMilk> oatMilks) {
    // this.oatMilks = oatMilks;
    // }

    // public void addCandy() {

    // }

    // public ArrayList<Candy> getCandies() {
    // return candies;
    // }

    // public void setCandies(ArrayList<Candy> candies) {
    // this.candies = candies;
    // }

}
