package pl.greim.service;

import pl.greim.model.Car;
import pl.greim.model.Contract;
import pl.greim.model.Renter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class RenterService {
    private List<Renter> renters = new ArrayList<>();

    public Renter createRenter(String name , String surname) {
        Renter newRenter = new Renter();
        newRenter.setRenterId(UUID.randomUUID().toString());
        newRenter.setName(name);
        newRenter.setSurname(surname);
        renters.add(newRenter);

        return newRenter;
    }

    public Renter editRenter(String renterId,String name, String surname) {

        Renter foundedRenter = renters.stream().filter(contract -> renterId.equals(contract.getRenterId())).findFirst().orElse(null);
        foundedRenter.setName(name);
        foundedRenter.setSurname(surname);

        return foundedRenter;
    }

    public String showRenter(String RenterId) {
        return getRenter(RenterId).toString();
    }

    public Renter getRenter(String renterId) {
        return renters.stream().filter(car -> renterId.equals(car.getRenterId())).findFirst().orElse(null);
    }

    public void showRenters() {
        for (Renter renter : renters){
            System.out.println(renter.toString());
        }
    }

    public List<Renter> getRenters(){
        return renters;
    }

    public void deleteRenter(String renterId) {
        renters.removeIf(car -> renterId.equals(car.getRenterId()));
    }
}
