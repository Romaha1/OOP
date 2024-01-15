class Croupier {
    private double casinoBalance;

    Croupier(double initialBalance) {
        this.casinoBalance = initialBalance;
    }

    double getCasinoBalance() {
        return casinoBalance;
    }

    void collectBets(double totalBets) {
        casinoBalance += totalBets;
    }

    void payOutWinners(double totalPayout) {
        casinoBalance -= totalPayout;
    }
}
