package pl.greim.model;

import java.util.Date;

public class Contract{
    private String contractId;
    private Car rentedCar;
    private Renter renter;
    private Date startDate;
    private Date endDate;

    public Contract() {
    }

    public Contract(String contractId, Car rentedCar, Renter renter, Date startDate, Date endDate) {
        this.contractId = contractId;
        this.rentedCar = rentedCar;
        this.renter = renter;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Car getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(Car rentedCar) {
        this.rentedCar = rentedCar;
    }

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}