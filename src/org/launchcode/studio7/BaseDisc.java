package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String discType;
    private ArrayList<String> contents;

    public BaseDisc(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        name = aName;
        storageCapacity = maxCapacity;
        discType = aType;
        remainingCapacity = spaceLeft();
    }

    public int checkCapacity(int dataWritten) {
        if (storageCapacity > dataWritten) {
            return storageCapacity;
        }
        return dataWritten;
    }

    public int spaceLeft() {
        return (storageCapacity - capacityUsed);
    }


    public String discInfo() {
        String output = String.format("\nDisc name: %s\nMax capacity: %d MB" +
                "\nSpace used: %d MB" +
                "\nAvailable space: %d MB\n", name, storageCapacity, capacityUsed, remainingCapacity);
        return output;
    }

    public String writeData(int dataSize) {
        if (dataSize > remainingCapacity) {
            return "Not enough disc space!";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;

        return "\nData written to disc. Remaining space = " + remainingCapacity + " MB";
    }
}
