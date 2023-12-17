public class Car extends Transport implements HasTyres, HasEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у машины");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель у машины");
    }


    @Override
    public void check() {
        checkTyres(this);
        checkEngine();
    }
}
