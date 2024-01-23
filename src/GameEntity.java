import java.util.Scanner;

abstract class GameEntity {
    abstract void processInput(double data);

    static void staticMethod(double data) {
        System.out.println("Static method with data: " + data);
    }
    void customMethod(GameEntity otherEntity) {
        // Виклик будь-якого методу з іншого об'єкта
        otherEntity.processInput(42.0);

        // Виклик будь-якої змінної з іншого об'єкта
        System.out.println("Other entity's variable: " + otherEntity.getClass().getSimpleName());
    }

    protected void setVIP(boolean b) {
    }
}