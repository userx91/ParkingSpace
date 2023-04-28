package org.prasanna.projects.parkingSpace;

public interface ParkingSpace {
    ParkingToken park(Vehicle vehicle);
    ParkingBill unPark(ParkingToken token);

    /* ToDo: Future Implementations
    public ParkingBill unPark(Vehicle vehicle);
    public ParkingBill unPark(ContactDetails contactDetails);
    */
}
