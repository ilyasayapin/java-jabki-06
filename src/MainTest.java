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

//        int x = game.getNumber();
//        int y = x + 1;
//        Assertions.assertEquals("Больше", game.chekGuess(y));

    }
}