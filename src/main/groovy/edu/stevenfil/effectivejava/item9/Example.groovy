package edu.stevenfil.effectivejava.item9

/**
 * Use try-with-resources instead of try-finally
 *
 * @author: Sven Fillinger
 */
class Example {

    static void main(String[] args) {
        // Groovy has his own paradigm for that
        println "Type something in the command line:"
        System.in.newReader().withCloseable {
            def input = it.readLine()
            File file = new File("Item9.txt")
            file.withWriter {
                it.write(input)
            }
        }
    }

}
