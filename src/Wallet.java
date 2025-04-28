public class Wallet {

    private String owner = "Супермен";
    private double ballance;

    Wallet() {
        this.owner = "Не известно";
        this.ballance = 0;
    }

    Wallet(String owner) {
        this.owner = owner;
        this.ballance = 0;
    }

    Wallet(int money) {
        this.owner = "Не известно";
        this.ballance = money;
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
        if (amount > 0) {
            ballance += amount;
        } else {
            System.out.println("Введите положительное число");
        }
    }

    public void spend(int amount) {
        if (amount > 0) {
            if (this.ballance >= amount) {
                ballance -= amount;
            } else {
                System.out.println("Баланс не может уйти в минус");
            }
        } else {
            System.out.println("Введите положительное число");
        }
    }
}

