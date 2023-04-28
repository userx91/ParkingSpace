package org.prasanna.projects.parkingSpace;

public enum VehicleType {
    MOTORCYCLE("MotorCycle"),
    CAR("Car"),
    SUV("SUV"),
    BUS("Bus");
    public final String vehicleType;

    private VehicleType(String vehcileType) {
        this.vehicleType = vehcileType;
    }
}
