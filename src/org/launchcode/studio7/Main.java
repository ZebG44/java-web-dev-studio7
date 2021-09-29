package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("War Games", 700, "CD-R", 350);
        DVD dvd = new DVD("HAL 9000", 4700, "DVD-RW", 1350);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();


        System.out.println(cd.writeData(275));
        System.out.println(dvd.writeData(4500));
        System.out.println(cd.writeData(2275));

        System.out.println(cd.discInfo());
        System.out.println(dvd.discInfo());

        System.out.println("Storage space remaining" + cd.spaceLeft() + " MB");
        System.out.println("Storage space remaining" + dvd.spaceLeft() + " MB");


        System.out.println(cd.checkCapacity(0) + " MB");
        System.out.println(dvd.checkCapacity(0) + " MB");
    }
}
