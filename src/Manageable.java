public interface Manageable {

    void check();

    default void check(Transport transport) {
        System.out.println("Обслуживаем " +transport.getModelName());
        transport.check();
    }
}
