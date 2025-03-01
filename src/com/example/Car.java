package com.example;

public class Car implements Comparable<Car> {
    private String brand;
    private int year;
    private int price;

    // Конструктор
    public Car(String brand, int year, int price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    // Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{brand='" + brand + "', year=" + year + ", price=" + price + "}";
    }

    // Реализация сравнения для сортировки (по цене)
    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.price, other.price);
    }
}
