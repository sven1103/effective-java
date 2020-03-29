package edu.stevenfil.effectivejava.item10

/**
 * Item 10: Obey the general contract when overriding equals
 *
 * @author: Sven Fillinger
 */
class Example {

    static void main(String[] args) {
        def x = new Equality(1,3)
        def y = new Equality(1,3)
        def z = new Equality(1,3)
        def o = new Equality(0,5)

        println "Equality is reflexive: ${isReflexive(x)}"
        println "Equality is symmetric: ${isSymmetric(x, y)}"
        println "Equality is transitive: ${isTransitive(x, y, z)}"
        println "Equality is consistent: ${isConsistent(x, y)}"
        println "Equality is equal null: ${x == null}"

        // Not a property but nice to check
        println "True different objects must return false: ${x == o}"

        // Now the car example

        def porscheCayenne = new SportCar("Porsche", "blue", 400)
        def porscheBoxer = new Car("Porsche", "blue")
        def porscheCarrera = new SportCar("Porsche", "blue", 350)

        // Test for transitivity
        // x.equals(y)
        println porscheCayenne == porscheBoxer
        // y.equals(z)
        println porscheBoxer == porscheCarrera
        // x.equals(z); this will be false!
        println porscheCayenne == porscheCarrera


    }

    static boolean isReflexive(Equality x) {
        return x == x
    }

    static boolean isSymmetric(Equality x, Equality y) {
        return y == x && x == y
    }

    static boolean isTransitive(Equality x, Equality y, Equality z) {
        return x == z && y == z && y == x
    }

    static boolean isConsistent(Equality x, Equality y) {
        return x == y && x == y
    }


}
