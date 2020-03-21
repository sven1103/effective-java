package edu.stevenfil.effectivejava.item1

import edu.stevenfil.effectivejava.item1.cars.Ferrari
import edu.stevenfil.effectivejava.item1.cars.Porsche

class Cars {

    private Cars() {
        new AssertionError()
    }

    static Car create(CarType type) {
        return createCar(type)
    }

    private static Car createCar(CarType type) {
        switch(type) {
            case CarType.FERARRI:
                new Ferrari()
                break
            case CarType.PORSCHE:
                new Porsche()
                break
        }

    }


}
