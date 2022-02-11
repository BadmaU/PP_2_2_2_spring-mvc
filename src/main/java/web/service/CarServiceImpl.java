package web.service;

import org.springframework.stereotype.Component;
import web.DAO.CarDAO;
import web.DAO.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    public CarServiceImpl() {
    }

    CarDAO carDAO = new CarDaoImpl();


    @Override
    public List<Car> showAllCar() {
        return carDAO.showAllCar();
    }

    @Override
    public List<Car> showSomeCar(int count) {
        if(count > 0 && count < 5) {
            return carDAO.showAllCar().stream().limit(count).toList();
        }else {
            return carDAO.showAllCar();
        }
    }
}
