package Collections

fun main(args: Array<String>) {

    var arrayList = arrayListOf("Hello", "World") // constructs an array list of Strings
    var linkedList = linkedListOf("Hello", "World") // constructs a linked list of Strings
    var hashMap = hashMapOf(1 to "A", 2 to "B") // constructs a hash map of Ints to Strings
    var linkedMap = linkedMapOf(1 to "A", 2 to "B") // constructs a linked map
    var sortedMap = sortedMapOf(1 to "A", 2 to "B") // constructs a sorted map
    var sortedSet = sortedSetOf(1, 2, 3) // constructs a sorted set]
    println(arrayList)
    println(linkedList)
    println(hashMap)
    println(linkedMap)
    println(sortedMap)
    println(sortedSet)

    sortedSet.any {
        it % 2 == 0
    }

    arrayList forEach { println(it) }
}