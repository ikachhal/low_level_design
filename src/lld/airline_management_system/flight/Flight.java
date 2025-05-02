package lld.airline_management_system.flight;

import java.time.LocalDateTime;
import java.util.Date;

public class Flight {
    private String flightNumber;
    private String source;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private LocalDateTime localDateTime;
    private int availableSeats;
    private String aircraftModel;

    public Flight(String flightNumber, String source, String destination, LocalDateTime departureTime,
                  LocalDateTime arrivalTime, String aircraftModel, LocalDateTime localDateTime, int aircraftCapacity) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraftModel = aircraftModel;
        this.localDateTime = localDateTime;
        this.availableSeats = aircraftCapacity; // Default to 0 available seats
    }

    // Getters and Setters
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public LocalDateTime getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }
    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    public String getAircraftModel() {
        return this.aircraftModel;
    }
}
