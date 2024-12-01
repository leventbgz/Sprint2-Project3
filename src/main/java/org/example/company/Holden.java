package org.example.company;

public class Holden extends Car{
    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "the Holden's engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the Holden is accelerating";
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the Holden is braking";
    }
}
