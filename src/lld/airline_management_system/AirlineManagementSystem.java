package lld.airline_management_system;

import lld.airline_management_system.Exception.BookingFailedException;
import lld.airline_management_system.aircraft.Aircraft;
import lld.airline_management_system.aircraft.AircraftManager;
import lld.airline_management_system.aircraft.Seat;
import lld.airline_management_system.aircraft.SeatStatus;
import lld.airline_management_system.booking.Booking;
import lld.airline_management_system.booking.BookingManager;
import lld.airline_management_system.flight.Flight;
import lld.airline_management_system.flight.FlightSearch;
import lld.airline_management_system.user.Passenger;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AirlineManagementSystem {
    private final List<Flight> flights;
    private final FlightSearch flightSearch;

    public AirlineManagementSystem() {
        this.flights = new ArrayList<>();
        this.flightSearch = new FlightSearch(flights);
    }

    public void addAircraft(Aircraft aircraft, int businessClassSeats, int premiumEconomyClass, int economyClassSeats) {
        AircraftManager.addAircraft(aircraft, businessClassSeats, premiumEconomyClass, economyClassSeats);
    }
    public void addFlight(Flight flight) {
        flights.add(flight);
    }
    public Booking bookFlight(Flight flight, Passenger passenger, String seatNumber, double price) {
        String airCraftModel = flight.getAircraftModel();
        List<Seat> availableSeats = AircraftManager.getSeats(airCraftModel);
        Seat seat = null;
        try {
            if (availableSeats == null || availableSeats.isEmpty()) {
                System.out.println("No seats available for this flight");
                throw new BookingFailedException("Booking failed: No seats available");
            } else {
                for (Seat availableSeat : availableSeats) {
                    if (availableSeat.getSeatNumber().equals(seatNumber)) {
                        if (availableSeat.getSeatStatus() == SeatStatus.BOOKED) {
                            System.out.println("Seat already booked");
                            throw new BookingFailedException("Booking failed: Seat already booked");
                        } else {
                            availableSeat.setSeatStatus(SeatStatus.BOOKED);
                            seat = availableSeat;
                        }
                        break;
                    }
                }
            }
        } catch (BookingFailedException e) {
            System.out.println("Error while booking seat: " + e.getMessage());
            return null;
        }
        return BookingManager.bookTicket(passenger, flight, seat, price);
    }

    public void cancelBooking(String bookingId) {
        BookingManager.cancelTicket(bookingId);
        Seat seat = BookingManager.getBooking(bookingId).getSeat();
        if (seat != null) {
            seat.setSeatStatus(SeatStatus.AVAILABLE);
        }
    }

    public List<Flight> searchFlights(String source, String destination, LocalDateTime date) {
        return flightSearch.searchFlight(source, destination, date);
    }
}
