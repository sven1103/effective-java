package edu.stevenfil.effectivejava.item11

/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
class SuperSportsCar extends SportCar{
    SuperSportsCar(String brand, String color, int hp) {
        super(brand, color, hp)
    }

    @Override
    int hashCode(){
        int result = super.brand.hashCode()
        result = 31 * result + super.color.hashCode()
        result = 31 * result + Integer.hashCode(super.horsepower)
        return result
    }
}
