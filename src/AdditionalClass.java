class AdditionalClass {
    // 2.1. Статичні змінні екземплярів класу
    private static int staticVariable1 = 10;
    private static int staticVariable2;

    // Статичний блок ініціалізації для ініціалізації staticVariable2
    static {
        staticVariable2 = 20;
    }

    // 2.2. Перший статичний метод
    static void firstStaticMethod() {
        System.out.println("First static method. Static variables: " + staticVariable1 + ", " + staticVariable2);
    }

    // 2.3. Другий статичний метод
    static void secondStaticMethod() {
        // Використання результатів роботи першого методу
        firstStaticMethod();
        System.out.println("Second static method.");
    }
}
