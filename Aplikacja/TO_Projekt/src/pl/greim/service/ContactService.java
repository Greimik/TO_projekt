package pl.greim.service;

import pl.greim.model.Car;
import pl.greim.model.Contract;
import pl.greim.model.Renter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class ContactService {
    private List<Contract> contacts = new ArrayList<>();

    public Contract createContract(Car car, Renter renter, Date startDate, Date endDate) {
        Contract newContract = new Contract();
        newContract.setContractId(UUID.randomUUID().toString());
        newContract.setRentedCar(car);
        newContract.setRenter(renter);
        newContract.setStartDate(startDate);
        newContract.setEndDate(endDate);
        contacts.add(newContract);

        return newContract;
    }

    public Contract editContract(String contractId,Car car, Renter renter, Date startDate, Date endDate) {

        Contract foundedContract = contacts.stream().filter(contract -> contractId.equals(contract.getContractId())).findFirst().orElse(null);
        foundedContract.setRentedCar(car);
        foundedContract.setRenter(renter);
        foundedContract.setStartDate(startDate);
        foundedContract.setEndDate(endDate);

        return foundedContract;
    }

    public String showContract(String ContractId) {
        return getContract(ContractId).toString();
    }

    public Contract getContract(String contractId) {
        return contacts.stream().filter(car -> contractId.equals(car.getContractId())).findFirst().orElse(null);
    }

    public void showContracts() {
        for (Contract contract : contacts){
            System.out.println(contract.toString());
        }
    }

    public List<Contract> getContracts(){
        return contacts;
    }

    public void deleteContract(String contractId) {
        contacts.removeIf(car -> contractId.equals(car.getContractId()));
    }
}
