package model;

import java.util.Objects;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public void move(MovableStrategy strategy) {
        if(strategy.isMovable()) {
            position++;
        }
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
