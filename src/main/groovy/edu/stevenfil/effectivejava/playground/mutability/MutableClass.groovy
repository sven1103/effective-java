package edu.stevenfil.effectivejava.playground.mutability

/**
 * <add class description here>
 *
 * @author: Sven Fillinger
 */
class MutableClass {

    private final List mutableList

    MutableClass(List mutableList) {
        this.mutableList = mutableList
    }

    static void main(String[] args) {
        List<String> myList = new ArrayList()
        myList.add("Test")
        def myMutableObject = new MutableClass(myList)
        def myImmutableObject = new ImmutableClass(myList)
        println "Mutable object's list before modification: ${myMutableObject.mutableList}"
        println "Immutable object's list before modification: ${myImmutableObject.myList}"
        myList.add("Another Test")
        // List in the object was modified as well
        println "Mutable object's list after modification: ${myMutableObject.mutableList}"
        // Whereas in the ImmutableClass object the list was not modified
        println "Immutable object's list after modification: ${myImmutableObject.myList}"
    }

}
