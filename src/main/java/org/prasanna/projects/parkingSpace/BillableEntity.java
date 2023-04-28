package org.prasanna.projects.parkingSpace;

public interface BillableEntity {
    Token issueToken(Vehicle vehicle);
    UsageBill issueBill(Token token);
}
