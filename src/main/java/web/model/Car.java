package web.model;

public class Car {

    private String model;

    private int number;

    private String carOwner;

    public Car() {
    }

    public Car(String model, int number, String carOwner) {
        this.model = model;
        this.number = number;
        this.carOwner = carOwner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", carOwner='" + carOwner + '\'' +
                '}';
    }
}
