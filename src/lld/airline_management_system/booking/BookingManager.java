package lld.airline_management_system.booking;

import lld.airline_management_system.aircraft.Seat;
import lld.airline_management_system.flight.Flight;
import lld.airline_management_system.user.Passenger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class BookingManager {
    private static BookingManager instance;
    private final Map<String, Booking> bookings;
    private static final Object lock = new Object();
    private final AtomicInteger bookingCounter = new AtomicInteger(0);

    private BookingManager() {
        this.bookings = new HashMap<>();
    }

    // Singleton pattern to ensure only one instance of BookingManager
    public static BookingManager getInstance() {
        if (instance == null) {
            synchronized (BookingManager.class) {
                if (instance == null) {
                    instance = new BookingManager();
                }
            }
        }
        return instance;
    }

    // It is created as static as it is not dependent on the instance of the class
    public static Booking bookTicket(Passenger passenger, Flight flight, Seat seat, double price) {
        // Logic to book a ticket
        String bookingId = getInstance().generateBookingId();
        Booking booking = new Booking(bookingId, passenger.getName(), flight.getFlightNumber(),
                seat, BookingStatus.CONFIRMED, price);
        // synchronizing it so multiple threads do not create same booking id
        synchronized (lock) {
            getInstance().bookings.put(bookingId, booking);
        }
        return booking;
    }

    public static void cancelTicket(String bookingId) {
        // Logic to cancel a ticket
        synchronized (lock) {
            if (!getInstance().bookings.containsKey(bookingId)) {
                System.out.println("Booking ID not found");
                return;
            } else {
                getInstance().bookings.get(bookingId).cancel();
            }
        }

        System.out.println("Ticket with booking ID " + bookingId + " has been cancelled");
    }

    public static Booking getBooking(String bookingId) {
        // Logic to get booking details
        if (!getInstance().bookings.containsKey(bookingId)) {
            System.out.println("Booking ID not found");
            return null;
        } else {
            return getInstance().bookings.get(bookingId);
        }
    }

    public static void viewBookingDetails(String bookingId) {
        // Logic to view booking details
        System.out.println("Details for booking ID " + bookingId);
    }

    public String generateBookingId() {
        int bookingId = bookingCounter.incrementAndGet();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        return "BKG" + timestamp + String.format("%04d", bookingId);
    }
}
