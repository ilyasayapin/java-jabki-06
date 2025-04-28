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
            this.orderId += 1;
            this.items = this.items + ", " + name;
            this.totalPrice = this.totalPrice + price;
        }
    }
}

