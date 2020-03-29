package edu.stevenfil.effectivejava.item10

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

}
