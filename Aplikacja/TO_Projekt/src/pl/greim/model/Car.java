package pl.greim.model;

import java.util.Date;

public class Car {
    private String carId;
    private String name;
    private Date yearOfProduction;
    private String typeOfEngine;
    private String make;

    public Car(String carId, String name, Date yearOfProduction, String typeOfEngine, String make) {
        this.carId = carId;
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.typeOfEngine = typeOfEngine;
        this.make = make;
    }

    public Car() {
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Date yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", typeOfEngine='" + typeOfEngine + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
