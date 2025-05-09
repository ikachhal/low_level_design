package lld.airline_management_system.aircraft;

public class Seat {

    private final String seatNumber;
    private final SeatType seatType;
    private SeatStatus seatStatus;

    public Seat(String seatNumber, SeatType seatType) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.seatStatus = SeatStatus.AVAILABLE;
    }

    public String getSeatNumber() {
        return seatNumber;
    }
    public SeatType getSeatType() {
        return seatType;
    }
    public SeatStatus getSeatStatus() {
        return seatStatus;
    }
    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }
}
