package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> showAllCar();

    List<Car> showSomeCar(int count);
}
