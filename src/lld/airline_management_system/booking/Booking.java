package lld.airline_management_system.booking;

import lld.airline_management_system.aircraft.Seat;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;

public class Booking {
    private final String bookingId;
    private final String passengerName;
    private final String flightNumber;
    private final Seat seat;
    private BookingStatus bookingStatus;
    private final String bookingDate;
    private final double amountPaid;

    public Booking(String bookingId, String passengerName, String flightNumber, Seat seat,
                   BookingStatus bookingStatus, double amountPaid) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.seat = seat;
        this.bookingStatus = bookingStatus;
        this.bookingDate = LocalDateTime.now().toString();
        this.amountPaid = amountPaid;
    }
    public String getBookingId() {
        return bookingId;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public Seat getSeat() {
        return seat;
    }
    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }
    public String setBookingStatus(BookingStatus bookingStatus) {
        return bookingStatus.toString();
    }
    public Double getAmountPaid() {
        return amountPaid;
    }
    public void cancel() {
        this.bookingStatus = BookingStatus.CANCELLED;
    }
}
