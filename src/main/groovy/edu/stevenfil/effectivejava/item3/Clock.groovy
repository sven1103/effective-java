package edu.stevenfil.effectivejava.item3

/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
enum Clock {
    INSTANCE

    def printCurrentDateTime() {
        println "${new Date().toOffsetDateTime()}"
    }

}
