package edu.stevenfil.effectivejava.item11

/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
class Example {

    static void main(String[] args) {
        Car greenFerrari = new Car("Ferrari", "green")
        Car redFerrari = new Car("Ferrari", "red")
        Car anotherRedFerrari = new Car("Ferrari", "red")
        Car redAndFastFerrari = new SportCar("Ferrari", "red", 400)

        println "Green Ferrari's hash code:\t\t\t${greenFerrari.hashCode()}"
        println "Red Ferrari's hash code:\t\t\t${redFerrari.hashCode()}"
        println "Another red Ferrari's hash code:\t${anotherRedFerrari.hashCode()}"

        HashSet<Car> garage = new HashSet<>()
        garage.add(greenFerrari)
        garage.add(redFerrari)
        garage.add(redAndFastFerrari)

        // The red and fast Ferrari will not be present in the set,
        // as the hashCode() method has not been overwritten
        assert garage.size() == 2
        assert garage.contains(greenFerrari)
        assert garage.contains(redFerrari)
        assert !(garage.find({ redFerrari }) instanceof SportCar)

        // Now we try to add a super sports car, a sports car that overrides
        // the hashCode() method of the Car class
        Car superFastRedFerrari = new SuperSportsCar("Ferrari", "red", 500)
        garage.add(superFastRedFerrari)

        assert garage.size() == 3
        assert garage.contains(superFastRedFerrari)
    }
}
