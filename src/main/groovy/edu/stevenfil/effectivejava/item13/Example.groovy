package edu.stevenfil.effectivejava.item13


/**
 * Item 13: Override clone judiciously
 *
 * @author: Sven Fillinger
 */
final class Example {

    static void main(String[] args) {

        Car greenPorsche = new Car("Porsche", "green")
        Car copiedPorsche = greenPorsche.clone()
        println copiedPorsche.toString()
        assert copiedPorsche == greenPorsche

        // SuperCar with features stored in a String array
        SportCar redFerrari = new SportCar("Ferrari", "red", 435, "Chromium rims")
        println redFerrari.toString()
        SportCar copiedFerrari = redFerrari.clone()
        assert redFerrari == copiedFerrari
        println copiedFerrari.toString()

        // No change the features of the redFerrari
        redFerrari.features[0] = "Golden rims"
        println "The copied Ferrari should still have chromium rims..."
        println copiedFerrari.toString()

        // Now the FamilyCar, which has a proper clone() method implementation
        

    }
}
