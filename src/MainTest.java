import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {

//    @Test
//    void accountTest() {
//        Account account = new Account();
//        Assertions.assertEquals(0.0, account.getBalance());
//
//        account.deposit(100);
//        Assertions.assertEquals(100.0, account.getBalance());
//
//        account.deposit(80);
//        Assertions.assertEquals(180.0, account.getBalance());
//
//        account.withdraw(-100);
//        Assertions.assertEquals(180.0, account.getBalance());
//
//        account.withdraw(100);
//        Assertions.assertEquals(80.0, account.getBalance());
//
//        account.withdraw(80);
//        Assertions.assertEquals(0.0, account.getBalance());
//
//        account.withdraw(1);
//        Assertions.assertEquals(0.0, account.getBalance());
//    }

    @Test
    void walletTest() {
        Wallet wallet = new Wallet();
        Assertions.assertEquals(0.0, wallet.getBalance());

        wallet.deposite(100);
        Assertions.assertEquals(100.0, wallet.getBalance());
        Assertions.assertThrows(IllegalArgumentException.class, () -> wallet.deposite(-100));
        Assertions.assertThrows(IllegalArgumentException.class, () -> wallet.deposite(0));

        wallet.spend(90);
        Assertions.assertEquals(10.0, wallet.getBalance());
        Assertions.assertThrows(IllegalArgumentException.class, () -> wallet.spend(-100));
        Assertions.assertThrows(IllegalArgumentException.class, () -> wallet.spend(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> wallet.spend(11));

    }

    @Test
    void gameTest() {
        Game game = new Game();
        Assertions.assertThrows(IllegalArgumentException.class, () -> game.chekGuess(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> game.chekGuess(101));
        Assertions.assertThrows(IllegalArgumentException.class, () -> game.chekGuess(-5));

        int x = game.getNumber();
        Assertions.assertEquals("Больше", game.chekGuess(x+1));
        Assertions.assertEquals("Меньше", game.chekGuess(x-1));
        Assertions.assertEquals("Угадал", game.chekGuess(x));
    }

    @Test
    void tvsetTest() {
        TVset tvset = new TVset();
        Assertions.assertEquals(1, tvset.getCurrentChannel());
        Assertions.assertEquals(50, tvset.getVolume());

        tvset.setChannel(10);
        Assertions.assertEquals(10, tvset.getCurrentChannel());
        Assertions.assertThrows(IllegalArgumentException.class, () -> tvset.setChannel(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> tvset.setChannel(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> tvset.setChannel(51));

        tvset.setVolume(0);
        Assertions.assertEquals(0, tvset.getVolume());
        Assertions.assertThrows(IllegalArgumentException.class, () -> tvset.setVolume(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> tvset.setChannel(101));
    }

    @Test
    void orderTest() {
        Order order = new Order();
        Assertions.assertEquals(1, order.getOrderId());
        Assertions.assertEquals("Вещь 1, Вещь 2, Вещь 3", order.getitems());
        Assertions.assertEquals(100, order.getTotalPrice());

        order.addItem("Новая вещь", 43);
        Assertions.assertEquals("Вещь 1, Вещь 2, Вещь 3, Новая вещь", order.getitems());
        Assertions.assertEquals(143, order.getTotalPrice());
        Assertions.assertThrows(IllegalArgumentException.class, () -> order.addItem("Тест1", -1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> order.addItem("", 20));
        Assertions.assertThrows(IllegalArgumentException.class, () -> order.addItem("", -5));
        Assertions.assertEquals(2, order.getOrderId());




    }

}