package pl.greim;

import pl.greim.model.Car;
import pl.greim.service.CarService;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        CarService carService = new CarService();

        Car first = carService.createCar("TEST", Calendar.getInstance().getTime(), "Diesel", "Toyota");
        carService.showCars();
        System.out.println("---------------");
        carService.editCar(first.getCarId(), "Changed", Calendar.getInstance().getTime(), "Bezin", "BMW");
        carService.showCars();
        System.out.println("---------------");
        carService.createCar("KURWA", Calendar.getInstance().getTime(), "OIL", "Mercedes");
        carService.showCars();
        System.out.println("---------------");
        carService.deleteCar(first.getCarId());
        carService.showCars();
        System.out.println("---------------");
    }
}
