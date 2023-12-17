public interface HasTruck {
    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
