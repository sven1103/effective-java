package edu.stevenfil.effectivejava.item11

/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
class Car {

    final String brand

    final String color

    Car(String brand, String color) {
        this.brand = brand
        this.color = color
    }

    @Override
    boolean equals(Object o) {
        return ((o instanceof Car) &&
                ((brand.equalsIgnoreCase(o.brand) && color.equalsIgnoreCase(o.color))))
    }

    @Override
    int hashCode() {
        int result = brand.hashCode()
        result = 31 * result + color.hashCode()
        return result
    }
}
