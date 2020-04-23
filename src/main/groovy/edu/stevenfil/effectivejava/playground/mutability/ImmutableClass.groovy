package edu.stevenfil.effectivejava.playground.mutability

/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
class ImmutableClass {

    final private List<String> myList

    ImmutableClass(List<String> myList) {
        this.myList = new ArrayList<>()
        myList.each { this.myList.add(it) }
    }

}
