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

    public void deposite(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Введите положительное число");
        } else {
            money += amount;
        }
    }

    public void spend(int amount) {
        if (amount > 0) {
            if (this.money >= amount) {
                money -= amount;
            } else {
                throw new IllegalArgumentException("Баланс не может уйти в минус");
            }
        } else {
            throw new IllegalArgumentException("Введите положительное число");
        }
    }
}

