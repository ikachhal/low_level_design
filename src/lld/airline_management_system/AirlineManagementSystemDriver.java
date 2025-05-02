package lld.airline_management_system;

import lld.airline_management_system.Exception.BookingFailedException;
import lld.airline_management_system.aircraft.*;
import lld.airline_management_system.booking.Booking;
import lld.airline_management_system.flight.Flight;
import lld.airline_management_system.user.Passenger;

import java.time.LocalDateTime;
import java.util.List;

public class AirlineManagementSystemDriver {
    public static void run() {
        AirlineManagementSystem airlineManagementSystem = new AirlineManagementSystem();
        System.out.println("Airline Management System is running...");

        System.out.println("Adding aircraft into the Airline Management System...");
        Aircraft aircraft = new Aircraft(AircraftType.COMMERCIAL, "737-800", 180);
        airlineManagementSystem.addAircraft(aircraft, 20, 30, 50);

        System.out.println("Adding flight into the Airline Management System...");

        LocalDateTime departureTime1 = LocalDateTime.now().plusDays(1);
        LocalDateTime arrivalTime1 = departureTime1.plusHours(5);
        Flight flight = new Flight("AI202", "New York", "Los Angeles", departureTime1,
                arrivalTime1, aircraft.getAircraftModel(), LocalDateTime.of(2025, 5, 1, 0, 0) , aircraft.getAircraftCapacity());
        airlineManagementSystem.addFlight(flight);

        LocalDateTime departureTime2 = LocalDateTime.now().plusDays(2);
        LocalDateTime arrivalTime2 = departureTime1.plusHours(10);
        Flight flight1 = new Flight("AI203", "Los Angeles", "New York", departureTime2,
                arrivalTime2, aircraft.getAircraftModel(), LocalDateTime.of(2025, 5, 5, 0, 0), aircraft.getAircraftCapacity());
        airlineManagementSystem.addFlight(flight1);

        LocalDateTime departureTime3 = LocalDateTime.now().plusDays(2);
        LocalDateTime arrivalTime3 = departureTime1.plusHours(10);
        Flight flight2 = new Flight("AI204", "New York", "Chicago", departureTime3,
                arrivalTime3, aircraft.getAircraftModel(), LocalDateTime.of(2025, 6, 1, 0, 0), aircraft.getAircraftCapacity());
        airlineManagementSystem.addFlight(flight2);

        System.out.println("Searching for flights from New York to Los Angeles...");
        List<Flight> availableFlights = airlineManagementSystem.searchFlights("New York", "Los Angeles", LocalDateTime.now().plusDays(1));

        for (Flight availableFlight : availableFlights) {
            System.out.println("Available Flight: " + availableFlight.getFlightNumber() + " from " + availableFlight.getSource() + " to " + availableFlight.getDestination());
        }

        System.out.println("Adding passenger John Doe...");
        Passenger passenger1 = new Passenger("U001", "John Doe", "john@example.com", "1234567890");
        Booking booking = null;
        try {
            System.out.println("Booking flight for passenger John Doe...");
            booking = airlineManagementSystem.bookFlight(flight, passenger1, "B1", 1000.0);

            if (booking != null) {
                System.out.println("Booking successful. Booking ID: " + booking.getBookingId());
            } else {
                System.out.println("Booking failed.");
            }
        } catch (BookingFailedException e) {
            System.out.println("Error while booking flight: " + e.getMessage());
        }
        if (booking != null) {
            airlineManagementSystem.cancelBooking(booking.getBookingId());
        }
    }
}
