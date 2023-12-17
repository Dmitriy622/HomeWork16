public class Bicycle extends Transport implements HasTyres{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }

    @Override
    public void check() {
        checkTyres(this);
    }
}