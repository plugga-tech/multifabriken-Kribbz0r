import java.util.ArrayList;

public class Order {

    // all lists that can store things. Find out if its doable in one list later.
    private ArrayList<Candy> candies = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Pipe> pipes = new ArrayList<>();
    private ArrayList<OatMilk> oatMilks = new ArrayList<>();

    private Order() {

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

    public void addCandy() {

    }

    public ArrayList<Candy> getCandies() {
        return candies;
    }

    public void setCandies(ArrayList<Candy> candies) {
        this.candies = candies;
    }

}
