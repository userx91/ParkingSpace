package org.prasanna.projects.parkingSpace;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class UsageBill {
    UsageUnits usageUnitsDetails;
    UsageCost usageCostDetails;
}

