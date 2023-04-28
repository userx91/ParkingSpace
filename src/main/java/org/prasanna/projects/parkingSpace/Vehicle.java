package org.prasanna.projects.parkingSpace;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Vehicle {
    private VehicleType vehicleType;
    private String vehicleNumber;
}
