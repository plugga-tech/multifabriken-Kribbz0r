import java.util.ArrayList;

public class Order {

    // all lists that can store things. Find out if its doable in one list later.
    private ArrayList<Candy> candies = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Pipe> pipes = new ArrayList<>();
    private ArrayList<OatMilk> oatMilks = new ArrayList<>();

    // private ArrayList<Order> orderItems = new ArrayList<>();

    Order() {

    }

    public void addItem(int diameter, int length) {
        pipes.add(new Pipe(diameter, length));
    }

    public void addItem(int diameter, double length) {
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

    public void setCandies(ArrayList<Candy> candies) {
        this.candies = candies;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Pipe> getPipes() {
        return pipes;
    }

    public void setPipes(ArrayList<Pipe> pipes) {
        this.pipes = pipes;
    }

    public ArrayList<OatMilk> getOatMilks() {
        return oatMilks;
    }

    public void setOatMilks(ArrayList<OatMilk> oatMilks) {
        this.oatMilks = oatMilks;
    }

    // public ArrayList<Order> getOrderItems() {
    // return orderItems;
    // }

    // public void setOrderItems(ArrayList<Order> orderItems) {
    // this.orderItems = orderItems;
    // }

}
