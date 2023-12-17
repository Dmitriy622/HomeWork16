public interface HasEngine {
    default void checkEngine() {
        System.out.println("Проверяем двигатель ");
    }
}
