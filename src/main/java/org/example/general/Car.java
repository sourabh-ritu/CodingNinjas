package org.example.general;

public class Car implements Vehicle{
    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public String getnameOfVehicle() {
        return "test";
    }
}
