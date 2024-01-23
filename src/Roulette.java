class Roulette extends GameEntity {
    private int currentWinningNumber;

    private void spinWheel() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Помилка при затримці потоку: " + e.getMessage());
        }
        currentWinningNumber = (int) (Math.random() * 36);
        System.out.println("На рулетці випало число " + currentWinningNumber);
    }

    private void setCurrentWinningNumber(int number) {
        this.currentWinningNumber = number;
    }

    @Override
    void processInput(double data) {
        System.out.println("Processing input for Roulette with data: " + data);
    }

    static Roulette customMethod(Croupier croupier) {
        Roulette roulette = new Roulette();
        roulette.setCurrentWinningNumber(17);
        return roulette;
    }

    // Допоміжний метод для виклику закритого методу spinWheel()
    void performSpinWheel() {
        spinWheel();
    }

    // Допоміжний метод для виклику закритого методу setCurrentWinningNumber()
    void performSetCurrentWinningNumber(int number) {
        setCurrentWinningNumber(number);
    }

    public int getCurrentWinningNumber() {
        return 0;
    }
}
