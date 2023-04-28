package org.prasanna.projects.parkingSpace;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsageCost {
    private CurrencyType currencyType;
    private Integer UsageCostValue;
}
