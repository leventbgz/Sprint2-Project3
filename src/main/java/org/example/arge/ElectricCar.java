package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the electric engine of " + super.getName());
    }

    @Override
    public void drive() {
        System.out.println("Driving the electric car " + super.getName());
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("Running the electric engine...");
    }
}
