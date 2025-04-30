import java.util.ArrayList;
public class Order {

    private int orderId = (int) Math.random() * 100 + 1);
    private ArrayList<String> items = new ArrayList<>();;
    private double totalPrice;

    public int getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void displayCurrentOrder() {
        System.out.printf(
                "Номер заказа: %s.\nСписок покупок: %s.\nСтоимость итого: %s.",
                this.orderId,
                this.items,
                this.totalPrice
        );
    }

    public void addItem(String name, int price) {
        if (name.equals("") || price < 0) {
            throw new IllegalArgumentException("Проверьте данные заказа");
        } else {
            this.items.add(name);
            this.totalPrice += price;
        }
    }
}

