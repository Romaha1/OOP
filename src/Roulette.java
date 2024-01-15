class Roulette {
    private int currentWinningNumber;

    int getCurrentWinningNumber() {
        return currentWinningNumber;
    }

    void setCurrentWinningNumber(int number) {
        this.currentWinningNumber = number;
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