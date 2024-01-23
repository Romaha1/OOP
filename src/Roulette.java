class Roulette extends GameEntity{
    private int currentWinningNumber;

    int getCurrentWinningNumber() {
        return currentWinningNumber;
    }

    void setCurrentWinningNumber(int number) {
        this.currentWinningNumber = number;
    }
    @Override
    void processInput(double data) {
        // Логіка для класу Roulette з параметром double
        System.out.println("Processing input for Roulette with data: " + data);
    }
    static Roulette customMethod(Croupier croupier) {
        // Повернення об'єкта з новими значеннями
        Roulette roulette = new Roulette();
        roulette.setCurrentWinningNumber(17);
        return roulette;
    }


    void spinWheel() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Помилка при затримці потоку: " + e.getMessage());
        }
        currentWinningNumber = (int) (Math.random() * 36);
        System.out.println("На рулетці випало число " + currentWinningNumber);
    }
}