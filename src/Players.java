import java.util.Scanner;
class Players extends GameEntity {
    private int playerMoney;
    private int betAmount;
    private String playerName;
    private int betNumber;
    private boolean isVIP;  // Нова змінна для визначення, чи є гравець VIP


    Players(String name, int money) {
        this.playerName = name;
        this.playerMoney = money;
        this.isVIP = false;  // Ініціалізація нової змінної

    }

    // Геттери та сеттери для усіх змінних
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

    int getBetNumber() {
        return betNumber;
    }

    void setBetNumber(int number) {
        this.betNumber = number;
    }

    String getPlayerName() {
        return playerName;
    }

    void setPlayerName(String name) {
        this.playerName = name;
    }

    // Метод для збільшення значення однієї змінної удвічі
    void doubleMoney() {
        this.playerMoney *= 2;
    }

    @Override
    void processInput(double data) {
        System.out.println("Processing input for Players with data: " + data);
    }

    static Players customMethod(Players player) {
        player.setPlayerName("Нове ім'я");
        player.setPlayerMoney(9999);
        player.setBetAmount(123);
        player.setVIP(true);  // Встановлення значення нової змінної
        return player;
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
        if (winAmount == betNumber) {
            playerMoney += betAmount * 36;
            System.out.println(playerName + " виграв " + (betAmount * 36) + " $!");
        } else {
            System.out.println(playerName + " програв " + betAmount + " $.");
        }
    }

    void recursiveMethod(String message, int recursionDepth) {
        System.out.println(message + " Recursion depth: " + recursionDepth);

        // Умова виходу з рекурсії
        if (recursionDepth > 0) {
            // Рекурсивний виклик методу
            recursiveMethod("Recursive call", recursionDepth - 1);
        }
    }

    // Метод, що використовує змінні екземплярів інших класів
    void useOtherClassVariables(Croupier croupier) {
        int croupierBalance = croupier.getCasinoBalance();
        System.out.println(playerName + " використовує баланс круп'є: " + croupierBalance);
    }
}
