import java.util.ArrayList;
import java.util.*;

public class Order {

    // all lists that can store things. Find out if its doable in one list later.

    // Lista med Godis. Godis har en String och en int.
    private ArrayList<Candy> candies = new ArrayList<>();

    // Lista med Bilar. Bilar har tre Strings.
    private ArrayList<Car> cars = new ArrayList<>();

    // Lista med rör. Rör har två int.
    private ArrayList<Pipe> pipes = new ArrayList<>();

    // Lista med havremjölk. Havremjölk har två double.
    private ArrayList<OatMilk> oatMilks = new ArrayList<>();

    private ArrayList<ArrayList<Order>> orderList = new ArrayList<>();

    // public void combineLists() {
    // orderList.add(candies);
    // orderList.add(cars);
    // orderList.add(pipes);
    // orderList.add(oatMilks);
    // }

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

    public ArrayList<ArrayList<Order>> getorderList() {
        return orderList;
    }

    public void setorderList(ArrayList<ArrayList<Order>> orderList) {
        this.orderList = orderList;
    }

}
