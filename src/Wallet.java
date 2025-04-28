public class Wallet {

    String owner;
    int money;

    Wallet() {
        this.owner = "Не известно";
        this.money = 0;
        }

    Wallet(String owner) {
        this.owner = owner;
        this.money = 0;
        }

    Wallet(int money) {
        this.owner = "Не известно";
        this.money = money;
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

}

