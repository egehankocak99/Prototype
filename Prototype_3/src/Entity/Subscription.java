package Entity;

public enum Subscription {
    BASIC(50),
    PREMIUM(100),
    ENTERPRISE(200);

    private final int price;

    Subscription(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}