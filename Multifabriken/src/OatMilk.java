class OatMilk extends Product {

    private double fat;
    private double cubicLiters;

    public OatMilk(double fat, double cubicLiters) {
        this.fat = fat;
        this.cubicLiters = cubicLiters;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCubicLiters() {
        return cubicLiters;
    }

    public void setCubicLiters(double cubicLiters) {
        this.cubicLiters = cubicLiters;
    }
}
