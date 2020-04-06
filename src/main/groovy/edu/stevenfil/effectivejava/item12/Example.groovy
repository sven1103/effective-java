package edu.stevenfil.effectivejava.item12

/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
class Example {

    static void main(String[] args) {
        Car greenFerrari = new Car("Ferrari", "green")
        Car redFerrari = new Car("Ferrari", "red")
        Car redAndFastFerrari = new SportCar("Ferrari", "red", 400)

        HashSet<Car> garage = new HashSet<>()
        garage.add(greenFerrari)
        garage.add(redFerrari)

        println "Your garage currently contains: "
        // Prints a not very useful String representation of the cars
        garage.each { println it }

        // The sport car class overrides the toString() method
        // and results in a more readable presentation
        println redAndFastFerrari
    }
}
