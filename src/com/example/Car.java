package com.example;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (!name.equals(car.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    } // Хэш Код не основывается на имени, изменяем на то, чтобы не было дубликатов по имени.

    public void drive() {
        System.out.println("Based car");
    } // Для проверки полиморфизма!
}
