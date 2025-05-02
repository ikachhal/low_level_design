package lld.airline_management_system.aircraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AircraftManager {
    private final Map<String, List<Seat>> aircraftListMap;
    private List<Aircraft> aircraftList;
    private static final Object lock = new Object();
    private static AircraftManager instance;
    private AircraftManager() {
        this.aircraftListMap = new HashMap<>();
        this.aircraftList = new ArrayList<>();
    }

    public static AircraftManager getInstance() {
        if (instance == null) {
            synchronized (AircraftManager.class) {
                if (instance == null)
                    instance = new AircraftManager();
            }
        }
        return instance;
    }

    public static void addAircraft(Aircraft aircraft, int busSeatsPercentage, int preEcoSeatsPercentage, int ecoSeatsPercentage) {
        synchronized (lock) {
            if (getInstance().aircraftListMap.containsKey(aircraft.getAircraftModel())) {
                System.out.println("Aircraft already exists");
            } else {
                getInstance().aircraftList.add(aircraft);
                getInstance().populateSeats(aircraft, busSeatsPercentage, preEcoSeatsPercentage, ecoSeatsPercentage);
            }
        }

    }

    public void populateSeats(Aircraft aircraft, int busSeatsPercentage, int preEcoSeatsPercentage, int ecoSeatsPercentage) {
        int bussinessSeats = (int) (aircraft.getAircraftCapacity() * (busSeatsPercentage * .01));
        int premiumEconomySeats = (int) (aircraft.getAircraftCapacity() * (preEcoSeatsPercentage * .01));
        int economySeats = (int) (aircraft.getAircraftCapacity() * (ecoSeatsPercentage * .01));
        List<Seat> seats = new ArrayList<>();
        for (int i = 0; i < bussinessSeats; i++) {
            seats.add(new Seat("B" + (i + 1), SeatType.BUSSINESS));
        }
        for (int i = 0; i < premiumEconomySeats; i++) {
            seats.add(new Seat("P" + (i + 1), SeatType.PREMIUM_ECONOMY));
        }
        for (int i = 0; i < economySeats; i++) {
            seats.add(new Seat("E" + (i + 1), SeatType.ECONOMY));
        }
        getInstance().aircraftListMap.put(aircraft.getAircraftModel(), seats);
    }

    public static List<Seat> getSeats(String aircraftModel) {
        synchronized (lock) {
            if (!getInstance().aircraftListMap.containsKey(aircraftModel)) {
                System.out.println("Aircraft not found");
                return null;
            } else {
                return getInstance().aircraftListMap.get(aircraftModel);
            }
        }
    }

    public void removeAircraft(Aircraft aircraft) {
        // Logic to remove aircraft
    }

    public Aircraft getAircraft(String aircraftId) {
        // Logic to get aircraft by ID
        return null;
    }
}
