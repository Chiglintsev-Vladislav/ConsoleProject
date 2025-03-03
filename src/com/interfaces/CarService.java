package com.interfaces;

import com.example.Car;

public interface CarService {
        void addCar(Car car);
        Car getNextCar();
        void printQueue();
}
