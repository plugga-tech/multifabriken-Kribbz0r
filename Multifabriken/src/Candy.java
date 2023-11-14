public class Candy {
    int amount;
    String taste;

    private Candy(String taste, int amount) {

        this.amount = amount;
        this.taste = taste;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
