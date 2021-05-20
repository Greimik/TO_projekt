package pl.greim.model;

public class Renter {
    private String renterId;
    private String name;
    private String surname;

    public Renter() {
    }

    public Renter(String renterId, String name, String surname) {
        this.renterId = renterId;
        this.name = name;
        this.surname = surname;
    }

    public String getRenterId() {
        return renterId;
    }

    public void setRenterId(String renterId) {
        this.renterId = renterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
