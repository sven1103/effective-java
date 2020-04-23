package edu.stevenfil.effectivejava.item13

/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
class SportCar extends Car {

    String[] features

    int horsepower

    SportCar(String brand, String color, int hp, String... features) {
        super(brand, color)
        horsepower = hp
        this.features = features
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

    @Override
    int hashCode(){
        int result = super.brand.hashCode()
        result = 31 * result + super.color.hashCode()
        result = 31 * result + Integer.hashCode(horsepower)
        return result
    }

    @Override
    String toString() {
        "A brand new $color $brand with $horsepower PS! Extra features:\n- ${features.join("\n- ")}"
    }

    @Override
    SportCar clone() {
        try {
            return (SportCar) super.clone()
        } catch (CloneNotSupportedException e) {
            throw new AssertionError()
        }
    }
}
