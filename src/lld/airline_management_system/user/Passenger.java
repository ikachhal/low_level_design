package lld.airline_management_system.user;

public class Passenger {
    private String passengerId;
    private String name;
    private String email;
    private String phoneNumber;

    public Passenger(String passengerId, String name, String email, String phoneNumber) {
        this.passengerId = passengerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
