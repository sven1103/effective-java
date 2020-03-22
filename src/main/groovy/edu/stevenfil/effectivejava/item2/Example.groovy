package edu.stevenfil.effectivejava.item2

/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
class Example {

    static void main(String[] args) {

        Stratocaster myStrat = new Stratocaster.Builder(Guitar.StringBrand.GIBSON, 6)
                .bodyMaterial(Guitar.BuildMaterial.ASH)
                .setBridgePickup(Stratocaster.SINGLECOIL.BRAND2)
                .build()
        LesPauls myPaula = new LesPauls.Builder(Guitar.StringBrand.DADDARIO, 6)
                .bodyMaterial(Guitar.BuildMaterial.IVORY)
                .setNeckPickup(LesPauls.Humbucker.TYPE2)
                .build()

        myStrat.printConfiguration()
        println "-------"
        myPaula.printConfiguration()
    }

}
