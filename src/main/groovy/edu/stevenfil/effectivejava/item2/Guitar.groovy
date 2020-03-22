package edu.stevenfil.effectivejava.item2

/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
abstract class Guitar implements ConfigurationConsolePrinter {

    enum StringBrand { ELIXIR, ERNIE, DADDARIO, GIBSON }

    enum BuildMaterial { ASH, IVORY, ALDER, BIRCH }

    final StringBrand stringBrand

    final BuildMaterial neck

    final BuildMaterial body

    final int strings

    abstract static class Builder<T extends Builder<T>> {

        BuildMaterial neck = BuildMaterial.BIRCH

        BuildMaterial body = BuildMaterial.BIRCH

        int strings

        StringBrand stringBrand

        Builder(StringBrand stringBrand, int strings) {
            this.stringBrand = stringBrand
            this.strings = strings
        }

        T neckMaterial(BuildMaterial material) {
            this.neck = material
            return self()
        }

        T bodyMaterial(BuildMaterial material) {
            this.body = material
            return self()
        }

        abstract Guitar build()

        protected abstract T self()
    }

    Guitar(Builder<?> builder) {
        stringBrand = builder.stringBrand
        neck = builder.neck
        body = builder.body
        strings = builder.strings
        if (strings < 6 || strings > 7 )
            throw new IllegalArgumentException("Guitar must have 6 or 7 strings.")
    }

}
