package edu.stevenfil.effectivejava.item1.cars

import edu.stevenfil.effectivejava.item1.Car

class Ferrari implements Car{
    def startEngine() {
        println "Starting the Ferrari engine....Rooooooar"
    }

    def stopEngine() {
        println "Stopping the Ferrari engine."
    }
}
