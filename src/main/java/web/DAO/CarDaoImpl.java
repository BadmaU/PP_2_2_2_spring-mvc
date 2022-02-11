package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDAO {


    public CarDaoImpl() {
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
        return cars;
    }
}