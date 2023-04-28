package org.prasanna.projects.parkingSpace;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public abstract class ParkingArea implements BillableEntity,ParkingSpace {
    List<ParkingSpot> parkingSpots;
    UsageUnitsCalculatorStrategy usageUnitsCalculatorStrategy = new ParkingUsageUnitsCalculatorStrategy();
    UsageCostCalculatorStrategy usageCostCalculator = new ParkingUsageCostCalculatorStrategy();

    public Token issueToken(Vehicle vehicle) {
        return ParkingToken
                .builder()
                .vehicle(vehicle)
                .entryTime(LocalDateTime.now())
                .build();
    }

    @Override
    public UsageBill issueBill(Token token) {
        ParkingToken parkingtoken = (ParkingToken) token;
        UsageUnits parkingUsageTimeInMinutes = usageUnitsCalculatorStrategy.calculateUsage(parkingtoken);
        UsageCost parkingUsageCost = usageCostCalculator.calculateUsageCost(parkingUsageTimeInMinutes, parkingtoken);
        return ParkingBill
                .builder()
                .usageUnitsDetails(parkingUsageTimeInMinutes)
                .usageCostDetails(parkingUsageCost)
                .parkingToken(parkingtoken)
                .build();
    }

    @Override
    public ParkingToken park(Vehicle vehicle) {

        return null;
    }

    @Override
    ParkingBill unPark(ParkingToken token){

    }

}
