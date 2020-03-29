package edu.stevenfil.effectivejava.item6

import edu.stevenfil.effectivejava.utils.Stopwatch

/**
 * Item 6: Avoid creating unnecessary objects
 *
 * @author: Sven Fillinger
 */
class Example {

    static void main(String[] args) {
        def stopWatch = new Stopwatch()
        stopWatch.start()
        fastSum()
        println stopWatch.stop()

        stopWatch.reset()

        stopWatch.start()
        slowSum()
        println stopWatch.stop()

    }

    // Hideously slow! Can you spot the object creation?
    private static long slowSum() {
        Long sum = 0L
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i
        return sum
    }

    // Avoids autoboxing
    private static long fastSum() {
        long sum = 0
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i
        return sum
    }
}
