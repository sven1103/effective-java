package edu.stevenfil.effectivejava.item10

/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
class SportCar extends Car {

    final int horsepower

    SportCar(String brand, String color, int hp) {
        super(brand, color)
        horsepower = hp
    }

    @Override
    boolean equals(Object o) {
        if (!(o instanceof Car)) {
            return false
        }
        if (!(o instanceof SportCar)) {
            return o.equals(this)
        }
        return super.equals(o) && ((SportCar) o).horsepower == horsepower

    }
}
