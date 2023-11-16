class Car {
    private String color;
    private String brand;
    private String numberPlate;

    public Car(String color, String brand, String numberPlate) {

        this.brand = brand;
        this.color = color;
        this.numberPlate = numberPlate;

    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

}
