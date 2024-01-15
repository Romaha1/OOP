import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Croupier casino = new Croupier(100000);
        Players player1 = new Players("Гравець 1", 5000);
        Players player2 = new Players("Гравець 2", 8000);

        player1.makeBet(scanner);
        player2.makeBet(scanner);

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
    }

    private static void handleWinning(Players player, int winningNumber, Croupier casino) {
        if (winningNumber == player.getBetAmount()) {
            int payout = player.getBetAmount() * 36;
            player.setPlayerMoney(player.getPlayerMoney() + payout);
            casino.payOutWinners(payout);
            System.out.println(player.getPlayerName() + " виграв " + payout + " $!");
        } else {
            System.out.println(player.getPlayerName() + " програв " + player.getBetAmount() + " $.");
        }
    }
}