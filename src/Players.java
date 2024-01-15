import java.util.Scanner;

class Players {
    private int playerMoney;
    private int betAmount;
    private String playerName;

    Players(String name, int money) {
        this.playerName = name;
        this.playerMoney = money;
    }

    int getPlayerMoney() {
        return playerMoney;
    }

    void setPlayerMoney(int money) {
        this.playerMoney = money;
    }

    int getBetAmount() {
        return betAmount;
    }

    void setBetAmount(int amount) {
        this.betAmount = amount;
    }

    String getPlayerName() {
        return playerName;
    }

    void setPlayerName(String name) {
        this.playerName = name;
    }

    void makeBet(Scanner scanner) {
        System.out.print(playerName + ", введіть суму вашої ставки: ");
        int amount = scanner.nextInt();

        if (amount <= playerMoney && amount > 0) {
            this.betAmount = amount;
            playerMoney -= amount;
            System.out.println(playerName + " зробив ставку на " + amount + " $.");
        } else {
            System.out.println(playerName + " не має достатньо грошей або введено неправильну суму для ставки.");
            makeBet(scanner); // Рекурсивний виклик для повторення введення ставки
        }
    }

    void spinRouletteWheel() {
        int winAmount = (int) (Math.random() * 36);
        if (winAmount == betAmount) {
            playerMoney += betAmount * 36;
            System.out.println(playerName + " виграв " + (betAmount * 36) + " $!");
        } else {
            System.out.println(playerName + " програв " + betAmount + " $.");
        }
    }
}