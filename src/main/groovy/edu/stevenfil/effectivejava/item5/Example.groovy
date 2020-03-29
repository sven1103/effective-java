package edu.stevenfil.effectivejava.item5

/**
 * Item 5: Prefer dependency injection over
 * hardwiring resources
 *
 * @author: Sven Fillinger
 */
class Example {

    static void main(String[] args) {
        Engine engine = new Engine()

        // Engine injected as dependency, which can be tested
        Car car = new Car(engine)
    }

}
