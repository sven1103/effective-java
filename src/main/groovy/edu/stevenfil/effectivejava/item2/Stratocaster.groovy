package edu.stevenfil.effectivejava.item2

/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
class Stratocaster extends Guitar{

    enum SINGLECOIL { BRAND1, BRAND2 }

    private final SINGLECOIL neckPickup

    private final SINGLECOIL middlePickup

    private final SINGLECOIL bridgePickup

    static class Builder extends Guitar.Builder<Builder>{

        private SINGLECOIL neckPickup = SINGLECOIL.BRAND1

        private SINGLECOIL middlePickup = SINGLECOIL.BRAND1

        private SINGLECOIL bridgePickup = SINGLECOIL.BRAND1

        Builder(Guitar.StringBrand stringBrand, int strings) {
            super(stringBrand, strings)
        }

        Builder setNeckPickup(SINGLECOIL pickup) {
            this.neckPickup = pickup
            return this
        }

        Builder setMiddlePickup(SINGLECOIL pickup) {
            this.middlePickup = pickup
            return this
        }

        Builder setBridgePickup(SINGLECOIL pickup) {
            this.bridgePickup = pickup
            return this
        }

        @Override
        protected Builder self() {
            return this
        }

        @Override
        Stratocaster build() {
            return new Stratocaster(this)
        }
    }

    private Stratocaster(Builder builder) {
        super(builder)
        neckPickup = builder.neckPickup
        middlePickup = builder.middlePickup
        bridgePickup = builder.bridgePickup
    }

    def printConfiguration() {
        println "Number of strings: $strings"
        println "String brand: $stringBrand"
        println "Neck pickup: $neckPickup"
        println "Bridge Pickup:  $bridgePickup"
        println "Middle pickup: $middlePickup"
    }

}
