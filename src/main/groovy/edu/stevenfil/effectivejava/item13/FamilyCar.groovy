package edu.stevenfil.effectivejava.item13

/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
class FamilyCar implements Cloneable{

    private String brand

    private String color

    private String[] features

    FamilyCar(String brand, String color, String... features) {
        this.brand = brand
        this.color = color
        this.features = features
    }

    @Override
    boolean equals(Object o) {
        return ((o instanceof FamilyCar) &&
                ((brand.equalsIgnoreCase(o.brand) && color.equalsIgnoreCase(o.color))))
    }

    @Override
    int hashCode() {
        int result = brand.hashCode()
        result = 31 * result + color.hashCode()
        return result
    }

    @Override
    String toString() {
        "A brand new $color $brand!"
    }

    @Override
    FamilyCar clone() {
        try {
            FamilyCar copiedCar = (FamilyCar) super.clone()
            copiedCar.features = new ArrayList[features.length]
            for (int i = 0; i < features.length; i++){
                copiedCar.features[i] = features[i]
            }
            return copiedCar
        } catch (CloneNotSupportedException e) {
            throw new AssertionError()
        }
    }
}
