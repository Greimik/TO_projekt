package pl.greim.service;

import pl.greim.model.Car;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public Car createCar(String name, Date yearOfProduction, String typeOfEngine, String make) {
        Car newCar = new Car();
        newCar.setCarId(UUID.randomUUID().toString());
        newCar.setMake(make);
        newCar.setName(name);
        newCar.setYearOfProduction(yearOfProduction);
        newCar.setTypeOfEngine(typeOfEngine);
        cars.add(newCar);

        return newCar;
    }

    public Car editCar(String carId, String name, Date yearOfProduction, String typeOfEngine, String make) {
        Car foundedCar = cars.stream().filter(car -> carId.equals(car.getCarId())).findFirst().orElse(null);
        foundedCar.setName(name);
        foundedCar.setTypeOfEngine(typeOfEngine);
        foundedCar.setMake(make);
        foundedCar.setYearOfProduction(yearOfProduction);

        return foundedCar;
    }

    public String showCar(String carId) {
        return getCar(carId).toString();
    }

    public Car getCar(String carId) {
        return cars.stream().filter(car -> carId.equals(car.getCarId())).findFirst().orElse(null);
    }

    public void showCars() {
        for (Car car : cars){
            System.out.println(car.toString());
        }
    }

    public List<Car> getCars(){
        return cars;
    }

    public void deleteCar(String carId) {
        cars.removeIf(car -> carId.equals(car.getCarId()));
    }
}
