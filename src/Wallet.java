public class Wallet {

    private String owner;
    private double money;

    Wallet() {
        this.owner = "Супермен";
        this.money = 0;
    }

    Wallet(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public void displayInfo() {
        System.out.printf("Владелец кошелька: %s. Баланс кошелька: %s\n",
                this.owner,
                this.money
        );
    }

    public double getBalance() {
        return this.money;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Введите положительное число");
        }
        money += amount;
    }

    public void spend(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Введите положительное число");
        } else if (this.money <= amount) {
            throw new IllegalArgumentException("Баланс не может уйти в минус");
        }
        money -= amount;
    }
}

