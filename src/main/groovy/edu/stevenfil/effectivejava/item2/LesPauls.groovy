package edu.stevenfil.effectivejava.item2

import sun.net.www.http.Hurryable

/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
class LesPauls extends Guitar{

    enum Humbucker { TYPE1, TYPE2, TYPE3 }

    private final Humbucker neckPickup

    private final Humbucker bridgePickup

    static class Builder extends Guitar.Builder<Builder> {

        Humbucker neckPickup = Humbucker.TYPE1

        Humbucker bridgePickup = Humbucker.TYPE1

        Builder(Guitar.StringBrand stringBrand, int strings) {
            super(stringBrand, strings)
        }

        Builder setNeckPickup(Humbucker pickup) {
            this.neckPickup = pickup
            return this
        }

        Builder setBridgePickup(Humbucker pickup) {
            this.bridgePickup = pickup
            return this
        }

        LesPauls build() {
            return new LesPauls(this)
        }

        protected Builder self() {
            return this
        }
    }

    private LesPauls(Builder builder) {
        super(builder)
        neckPickup = builder.neckPickup
        bridgePickup = builder.bridgePickup
    }

    def printConfiguration() {
        println "Guitar type: Les Pauls"
        println "Number of strings: $strings"
        println "String brand: $stringBrand"
        println "Neck pickup: $neckPickup"
        println "Bridge Pickup:  $bridgePickup"
    }
}
