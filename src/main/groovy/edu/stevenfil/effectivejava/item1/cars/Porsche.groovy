package edu.stevenfil.effectivejava.item1.cars

import edu.stevenfil.effectivejava.item1.Car

class Porsche implements Car {
    def startEngine() {
        println "Starting Porsche .... roar rooooar"
    }

    def stopEngine() {
        println "Stopping Porsche engine."
    }
}
