package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDAO {

    public CarDaoImpl() {
    }


    @Override
    public List<Car> showAllCar() {
        return null;
    }

    @Override
    public List<Car> showSomeCar(int count) {
        return null;
    }
}