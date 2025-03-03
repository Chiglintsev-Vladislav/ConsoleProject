package com.main.interfaces;

import com.main.example.Car;

public interface CarService {
        void addCar(Car car);
        Car getNextCar();
        void printQueue();
}
