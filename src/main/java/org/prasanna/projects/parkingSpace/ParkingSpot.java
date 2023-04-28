package org.prasanna.projects.parkingSpace;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParkingSpot {
    private ParkingSpotType parkingSpotType;
    private String parkingSpotNumber;
    private ContactDetails contactDetails;
    private Vehicle vehicle;
}
