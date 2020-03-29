package edu.stevenfil.effectivejava.item8;

/**
 * Item 8: Avoid finalizers and cleaners
 *
 * @author: Sven Fillinger
 */
class Example {

    static void main(String[] args) {
        def myRoom = new Room(200)
        myRoom.withCloseable {
            println "Goodbye."
        }

        def otherRoom = new Room(180)
        println "Byebye"
    }

}
