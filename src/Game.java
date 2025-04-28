public class Game {
    private int secretNumber = (int)(Math.random() * 100 + 1);

    public int getNumber() {
        return this.secretNumber;
    }

    public String chekGuess(int guess) {
        if (guess < 1 || guess > 100) {
            throw new IllegalArgumentException("Число должно быть от 1 до 100");
        }
        if (guess > secretNumber) {
            return "Больше";
        } else if (guess < secretNumber) {
            return "Меньше";
        } else {
            return "Угадал";
        }
    }

}
