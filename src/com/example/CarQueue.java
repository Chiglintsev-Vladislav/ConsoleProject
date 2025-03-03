package com.example;
import com.interfaces.CarService;

import java.util.*;

public class CarQueue implements CarService {
    private Queue<Car> queue;

    // Конструктор (можно выбрать тип очереди)
    public CarQueue(boolean usePriorityQueue) {
        if (usePriorityQueue) {
            this.queue = new PriorityQueue<>(); // Очередь с приоритетом (сортировка)
        } else {
            this.queue = new LinkedList<>(); // Обычная очередь (FIFO)
        }
    }

    @Override
    // Добавление автомобиля в очередь
    public void addCar(Car car) {
        queue.add(car);
    }
    @Override
    // Извлечение автомобиля из очереди
    public Car getNextCar() {
        return queue.poll();
    }
    @Override
    // Вывод всех автомобилей в очереди
    public void printQueue() {
        for (Car car : queue) {
            System.out.println(car);
        }
    }
}
