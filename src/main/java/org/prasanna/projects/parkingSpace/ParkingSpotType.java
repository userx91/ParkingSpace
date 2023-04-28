package org.prasanna.projects.parkingSpace;

public enum ParkingSpotType {
    SMALL("S"),
    LARGE("L"),
    EXTRA_LARGE("XL");
    public final String parkingSpotType;

    private ParkingSpotType(String parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }
}
