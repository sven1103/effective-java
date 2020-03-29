package edu.stevenfil.effectivejava.utils

import java.time.Duration
import groovy.time.TimeCategory
import groovy.time.TimeDuration

import java.time.Instant


/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
class Stopwatch {

    private Instant startTimestamp

    private Duration measuredTime

    Stopwatch() {
        reset()
    }

    void start(){
        startTimestamp = Instant.now()
    }

    Duration stop() {
        measuredTime = Duration.between(Instant.now(), startTimestamp) + measuredTime
        return measuredTime
    }

    void reset() {
        final Instant now = Instant.now()
        measuredTime = Duration.between(now, now)
    }



}
