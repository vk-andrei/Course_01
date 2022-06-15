package Lessons.REFLECTIONS;

import jdk.jfr.Description;

public class Car {
    @Description("the power of engine")
    private int horsePower;
    public final String serialNumber;

    public Car() {
        serialNumber = "";
    }

    public Car(int horsePower, String serialNumber) {
        this.horsePower = horsePower;
        this.serialNumber = serialNumber;
    }

    public int getHorsePower() {
        return horsePower;
    }

    void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    protected void printSerialNumber() {
        System.out.println(serialNumber);
    }
}
