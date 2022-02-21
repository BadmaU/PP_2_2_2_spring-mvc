package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;



@Controller
@RequestMapping(value = "/")
public class CarController {

    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/all_cars")
    public String showAllCar(Model model){
        model.addAttribute("all_cars", carService.showAllCar());
        return "cars";
    }

    @GetMapping("/cars")
    public String showSomeCar(@RequestParam("count") int count, Model model) {
        model.addAttribute("some_car", carService.showSomeCar(count));
        return "some_car";
    }
}