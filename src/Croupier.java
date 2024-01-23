class Croupier extends GameEntity{
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
    @Override
    void processInput(double data) {
        // Логіка для класу Croupier з параметром double
        System.out.println("Processing input for Croupier with data: " + data);
    }
    static Croupier customMethod(Players player) {
        // Повернення об'єкта з новими значеннями
        Croupier croupier = new Croupier(123456);
        croupier.collectBets(9999);
        croupier.payOutWinners(123);
        return croupier;
    }
}
