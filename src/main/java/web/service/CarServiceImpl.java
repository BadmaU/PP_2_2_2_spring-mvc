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

    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("car867", 867, "User1"));
        cars.add(new Car("car394", 394, "User2"));
        cars.add(new Car("car234", 234, "User3"));
        cars.add(new Car("car456", 456, "User4"));
        cars.add(new Car("car568", 568, "User5"));
    }

    @Override
    public List<Car> showAllCar() {
        return cars;
    }

    @Override
    public List<Car> showSomeCar(int count) {
        if(count > 0 && count < 5) {
            return cars.stream().limit(count).toList();
        }else {
            return cars;
        }
    }
}
