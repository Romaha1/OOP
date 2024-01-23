class Croupier extends GameEntity {
    private double casinoBalance;

    public Croupier(int initialBalance, String awesomeCasino) {

    }

    void collectBets(double i) {
    }
    void payOutWinners(int i) {
    }

    Croupier(double initialBalance) {
        this.casinoBalance = initialBalance;
    }

    // Геттер та сеттер для casinoBalance
    int getCasinoBalance() {
        return (int) casinoBalance;
    }

    void setCasinoBalance(double balance) {
        this.casinoBalance = balance;
    }

    // Метод для збільшення значення однієї змінної удвічі
    void doubleBalance() {
        this.casinoBalance *= 2;
    }

    @Override
    void processInput(double data) {
        System.out.println("Processing input for Croupier with data: " + data);
    }

    static Croupier customMethod(Players player) {
        Croupier croupier = new Croupier(123456, "Awesome Casino");  // Ініціалізація нової змінної
        croupier.collectBets(9999);
        croupier.payOutWinners(123);
        return croupier;
    }

    // Метод, що використовує змінні екземплярів інших класів
    void useOtherClassVariables(Players player) {
        int playerMoney = player.getPlayerMoney();
        System.out.println("Круп'є використовує гроші гравця: " + playerMoney);
    }
}

