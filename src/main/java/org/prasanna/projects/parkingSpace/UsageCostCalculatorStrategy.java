package org.prasanna.projects.parkingSpace;

public interface UsageCostCalculatorStrategy {
    UsageCost calculateUsageCost(UsageUnits usageUnits, Token token);
}
