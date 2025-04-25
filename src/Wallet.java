public class Wallet {

    String owner = "Илья";
    double money;

    public void displayInfo() {
        System.out.printf("Владелец кошелька: %s, Баланс кошелька: %s",
                this.owner,
                this.money
        );

    }
}
