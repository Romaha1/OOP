import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Croupier casino = new Croupier(100000);
        Players player1 = new Players("Гравець 1", 5000);
        Players player2 = new Players("Гравець 2", 8000);

        player1.makeBet(scanner);
        player2.makeBet(scanner);

        System.out.print("Гравець 1, введіть число на яке ви хочете зробити ставку: ");
        int numberPlayer1 = scanner.nextInt();
        player1.setBetNumber(numberPlayer1);

        System.out.print("Гравець 2, введіть число на яке ви хочете зробити ставку: ");
        int numberPlayer2 = scanner.nextInt();
        player2.setBetNumber(numberPlayer2);

        Roulette roulette = new Roulette();
        roulette.spinWheel();
        int winningNumber = roulette.getCurrentWinningNumber();

        double totalBets = player1.getBetAmount() + player2.getBetAmount();
        casino.collectBets(totalBets);

        handleWinning(player1, winningNumber, casino);
        handleWinning(player2, winningNumber, casino);

        System.out.println("Баланс казино: " + casino.getCasinoBalance() + " $.");
        System.out.println(player1.getPlayerName() + " має " + player1.getPlayerMoney() + " $.");
        System.out.println(player2.getPlayerName() + " має " + player2.getPlayerMoney() + " $.");

        // Додавання виклику рекурсивного методу
        player1.recursiveMethod("Initial message", 3);

        // Виклик новостворених методів
        player1.customMethod(player2);
        casino.customMethod(player1);
        roulette.customMethod(casino);
    }
    private static void handleWinning(Players player, int winningNumber, Croupier casino) {
        if (winningNumber == player.getBetNumber()) {
            int payout = player.getBetAmount() * 36;
            player.setPlayerMoney(player.getPlayerMoney() + payout);
            casino.payOutWinners(payout);
            System.out.println(player.getPlayerName() + " виграв " + payout + " $!");
        } else {
            System.out.println(player.getPlayerName() + " програв " + player.getBetAmount() + " $.");
        }
    }
}