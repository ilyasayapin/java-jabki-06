public class Order {
    private int orderId = 1;
    private String items;
    private double totalPrice;

    Order() {
        this.orderId = 1;
        this.items = "Вещь 1, Вещь 2, Вещь 3";
        this.totalPrice = 100;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getitems() {
        return items;
    }

}
