public class Pipe {
    double diameter;
    int length;

    private Pipe(double diameter, int length) {
        this.diameter = diameter;
        this.length = length;
    }

    // public void addPipe(double diameter, int length) {
    // Order.orderItems.add(diameter, length);
    // }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
