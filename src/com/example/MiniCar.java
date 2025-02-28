package com.example;

public class MiniCar extends Car {

    public MiniCar(String name) {
        super(name); // Вызов конструктора родительского класса
    }

    @Override
    public void drive() {
        System.out.println("MiniCar");
    }
}
