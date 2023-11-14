import java.util.ArrayList;

public class Car {
    // Things cars have
    private String color;
    private String brand;
    private String numberPlate;

    // List of cars is removed and all future lists are in Order.java
    // Try to make one list for everything

    // constructor for cars.
    private Car(String color, String brand, String numberPlate) {

        this.brand = brand;
        this.color = color;
        this.numberPlate = numberPlate;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    // method for creating a car. a car has a numberplate, colour and a brand

}
