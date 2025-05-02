package lld.airline_management_system.flight;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    private final List<Flight> flightList;

    public FlightSearch(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public List<Flight> searchFlight(String source, String destination, LocalDateTime date) {
        return flightList.stream()
                .filter(flight -> flight.getSource().equalsIgnoreCase(source)
                        && flight.getDestination().equalsIgnoreCase(destination)
                && flight.getDepartureTime().toLocalDate().equals(date.toLocalDate())).collect(Collectors.toList());
    }
}
