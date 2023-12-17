public class Truck extends Transport implements HasTyres, HasEngine, HasTruck{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовика");
    }

    @Override
    public void check() {
        checkTyres(this);
        checkEngine();
        checkTrailer();
    }
}
