package com.abstracts;

import java.util.Arrays;

public abstract class Transport {
    private String name;
    private int speed;
    private int weight;
    private byte[] data;

    // Constructor
    public Transport(String name, int speed, int weight, byte[] data) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.data = data;
    }
    public Transport(String name, int speed, int weight)
    {
        this(name, speed, weight, null);
    }
    // ОБЯЗАТЕЛЬНО РЕАЛИЗОВАТЬ В ДОЧЕРНИХ КЛАССАХ
    public abstract void colorTransport (String color);

    public void setTransport(String name, int speed, int weight, byte[] data) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.data = data;
    }
    public void getTransport() {
        System.out.println("Name: " + name);
        System.out.println("Speed: " + speed);
        System.out.println("Weight: " + weight);
        System.out.println("Data: " + Arrays.toString(data));
    }
    // Вложенный класс для поддержки двигателя
    public class Engine {
        private boolean isReady;
        private int km;
        public Engine(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;
        }
        public void getEngineInfo() {
            if (isReady) {
                System.out.println("Is engine ready: " + isReady);
                System.out.println("Distance traveled: " + km);
            } else {
                System.out.println("Engine is not ready.");
            }
        }
    }
}
