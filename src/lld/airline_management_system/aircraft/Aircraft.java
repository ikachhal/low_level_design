package lld.airline_management_system.aircraft;

public class Aircraft {

    private final AircraftType aircraftType;
    private final String aircraftModel;
    private final int aircraftCapacity;

    public Aircraft(AircraftType aircraftType, String aircraftModel, int aircraftCapacity) {
        this.aircraftType = aircraftType;
        this.aircraftModel = aircraftModel;
        this.aircraftCapacity = aircraftCapacity;
    }
    public int getAircraftCapacity() {
        return this.aircraftCapacity;
    }
    public String getAircraftModel() {
        return this.aircraftModel;
    }
}