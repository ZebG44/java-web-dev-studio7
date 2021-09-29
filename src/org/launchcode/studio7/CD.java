package org.launchcode.studio7;


public class CD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.
    public CD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("\nWould you like to play a game?");
    }

}
