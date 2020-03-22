package edu.stevenfil.effectivejava.item1

/**
 * Item 1: Static Factory methods
 *
 * Uses a static factory method to create different Car types.
 *
 * Each car type implements the interface Car, that provides basic
 * engine functionality.
 *
 * @author: Sven Fillinger
 */
class Example {

    static void main (String[] args) {
        Car myPorsche = Cars.create(CarType.PORSCHE)
        Car myFerrari = Cars.create(CarType.FERARRI)
        myPorsche.startEngine()
        myFerrari.startEngine()
    }

}
