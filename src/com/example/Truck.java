package com.example;

public class Truck extends Transport {
    private boolean isLoaded;
    private Engine engine = new Engine(false, 1);

    public Truck(String name, int speed, int weight) {
        super(name, speed, weight); // super class constructor is called
    }

    public void getEngineInfo() {
        engine.getEngineInfo(); // accessing the Engine class method
    }
    public void setTransport(String name, int speed, int weight, byte[] data, boolean isLoaded) {
        super.setTransport(name, speed, weight, data);
        this.isLoaded = isLoaded;
    }

    public void loadCargo(String cargo) {
        System.out.println("Truck loaded with " + cargo);
    }

    @Override
    public void getTransport() {
        super.getTransport();
        if (isLoaded) {
            System.out.println("Truck is loaded");
        }
    }
    @Override
    public void colorTransport(String color) {
        System.out.println("Truck color changed to " + color);
    }
}
