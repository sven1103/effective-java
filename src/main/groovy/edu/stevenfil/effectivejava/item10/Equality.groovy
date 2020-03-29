package edu.stevenfil.effectivejava.item10

/**
 * A sample class that adheres to the equivalence relation properties
 *
 * @author: Sven Fillinger
 */
class Equality {

    final int valueA

    final int valueb

    Equality(int a, int b) {
        valueA = a
        valueb = b
    }

    @Override
    boolean equals(Object o) {
        if (! o instanceof Equality) {
            return false
        }
        final Equality other = (Equality) o
        return (this.valueA == other.valueA && this.valueb == other.valueb)
    }


}
