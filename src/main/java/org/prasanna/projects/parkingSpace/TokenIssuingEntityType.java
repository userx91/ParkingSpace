package org.prasanna.projects.parkingSpace;

public enum TokenIssuingEntityType {
    MALL("Mall"),
    STADIUM("Stadium"),
    AIRPORT("Airport");
    public final String tokenIssuingEntity;

    private TokenIssuingEntityType(String tokenIssuingEntity) {
        this.tokenIssuingEntity = tokenIssuingEntity;
    }
}
