package edu.stevenfil.effectivejava.item12

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
        if (!(o instanceof edu.stevenfil.effectivejava.item11.Car)) {
            return false
        }
        if (!(o instanceof SportCar)) {
            return o.equals(this)
        }
        return super.equals(o) && ((SportCar) o).horsepower == horsepower
    }

    @Override
    int hashCode(){
        int result = super.brand.hashCode()
        result = 31 * result + super.color.hashCode()
        result = 31 * result + Integer.hashCode(horsepower)
        return result
    }

    @Override
    String toString() {
        "A brand new $color $brand with $horsepower PS!"
    }
}
