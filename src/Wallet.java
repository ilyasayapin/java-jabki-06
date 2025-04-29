public class Wallet {

    private String owner;
    private double ballance;

    Wallet() {
        this.owner = "Супермен";
        this.ballance = 0;
    }
    Wallet(String owner, int money) {
        this.owner = owner;
        this.ballance = money;
    }

    public void displayInfo() {
        System.out.printf("Владелец кошелька: %s. Баланс кошелька: %s\n",
                this.owner,
                this.ballance
        );
    }

    public double getBalance() {
        return this.ballance;
        }

    public void deposite(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Введите положительное число");
        } else {
            ballance += amount;
        }
    }

    public void spend(int amount) {
        if (amount > 0) {
            if (this.ballance >= amount) {
                ballance -= amount;
            } else {
                throw new IllegalArgumentException("Баланс не может уйти в минус");
            }
        } else {
            throw new IllegalArgumentException("Введите положительное число");
        }
    }
}

