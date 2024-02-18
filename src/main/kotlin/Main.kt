fun main() {
    print("hello world \n")
    val name = "shivam" // immutable
    val mood = "okish" // mutable
    val age = 19
    println("$name has $mood mood because it's his last year of teenage, as his age is $age")
    operators()
    type()
    groupingTypes()
    Control_flow()
}


fun operators(){
    var badPeople = 10
    badPeople += 7 // example of addition to the main variable (7 + 10)
    print("$badPeople \n")
    badPeople -= 2 // example of subtraction from the main variable (2 - 17)
    print("$badPeople \n")
    badPeople *= 3 // example of multiplication to the main variable (3 * 15)
    print("$badPeople \n")
    badPeople /= 5 // example of division to the main variable (45 / 5)
    print("$badPeople \n")
    badPeople %=2 // example of knowing the reminder of main variable (9 % 2)
    print("$badPeople \n")

}

fun type(){
    // Byte
    val maxByteValue: Byte = Byte.MAX_VALUE
    val minByteValue: Byte = Byte.MIN_VALUE
    println(maxByteValue)
    println(minByteValue)


    // Int
    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE
    println(maxIntegerValue)
    println(minIntegerValue)


    // Sort
    val maxShortValue: Short = Short.MAX_VALUE
    val minShortValue: Short = Short.MIN_VALUE
    println(maxShortValue)
    println(minShortValue)


    // Long
    val maxLongValue: Long = Long.MAX_VALUE
    val minLongValue: Long = Long.MIN_VALUE
    println(maxLongValue)
    println(minLongValue)
}

fun groupingTypes(){
    // List
    // Read-Only
    val fruits: List<String> = listOf("Orange","Mango","Strawberry","Banana","Preach")
    println(fruits)

    println("the fruits which are almost round are: ${fruits[0]} and ${fruits[4]}")

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("Square","Circle","Rectangle","Triangle")
    println(shapes)

    println("the fist and the last item in the list shapes are: ${shapes.first()} and ${shapes.last()}") //.first() and .last() are the example od Extension function
    println("checking weather Circle is present in the list shapes:${"Circle" in shapes}") // println("Circle" in shapes)

    // to add and remove in a mutable list
    shapes.add("Triangle_two")
    println(shapes)

    shapes.remove("Triangle_two")
    println(shapes)

    println(fruits.count())

    // 13 Feb
    // read-only set
    val readOnlyFruits = setOf("apple", "banana", "cherry", "cherry")
    println(message = readOnlyFruits) // total set
    println("This set has ${readOnlyFruits.count()} items") // 3 items
    println("banana" in readOnlyFruits) // true


    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple","banana","cherry","cherry" )
    fruit.add("dragonfruit") // add dragonfruit to the set
    println(fruit)

    fruit.remove("dragonfruit")
    println(fruit)

    // Map -- dictionary of python
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190,"orange" to 100)
    println(readOnlyJuiceMenu)

    val juiceMenue: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190,"orange" to 100)
    println(juiceMenue)


    // 18 Feb
    println("the no of items in juiceMenue is ${juiceMenue.count()}")
    // To add or remove items from a mutable map, use .put() and .remove() functions respectively:
    juiceMenue.put("coconut",394)
    println(juiceMenue)

    juiceMenue.remove("kiwi", 190)
    println(juiceMenue)

    println(readOnlyJuiceMenu.containsKey("kiwi"))
    println(readOnlyJuiceMenu.keys)
    println(readOnlyJuiceMenu.values)

    println(juiceMenue.containsKey("kiwi"))
    println(juiceMenue.keys)
    println(juiceMenue.values)

    // To check that a key or value is in a map, use the in operator:
    println("orange" in readOnlyJuiceMenu.keys)
    println(200 in readOnlyJuiceMenu.values)

    // Practice
    //Exercise 1
    //You have a list of “green” numbers and a list of “red” numbers. Complete the code to print how many numbers there are in total.
    fun Excrise1() {
        val greenNumbers = listOf(1, 4, 23)
        val redNumbers = listOf(17, 2)
        // Write your code here
        val a = greenNumbers.count()
        val b = redNumbers.count()
        println("The total no of elements present in greenNumbers & redNumbers are ${a+b}")
    }
    //Exercise 2
    //You have a set of protocols supported by your server. A user requests to use a particular protocol. Complete the program to check whether the requested protocol is supported or not (isSupported must be a Boolean value).
    fun Exercise2() {
        val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
        val requested = "smtp"
        val isSupported = requested.uppercase() in SUPPORTED
        println("Support for $requested: $isSupported")
    }
    //Exercise 3
    //Define a map that relates integer numbers from 1 to 3 to their corresponding spelling. Use this map to spell the given number.
    fun Exercise3() {
        val number2word = mapOf(1 to "one",2 to "two",3 to "three")
        val n = 2
        println("$n is spelt as '${number2word[n]}'")
    }
    Excrise1()
    Exercise2()
    Exercise3()

}

fun Control_flow() {
    // conditional statement
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }
    println(d)

    // we can also define if statement inside print statement
    val a = 1
    val b = 2
    println(
        if (a > b) a
        else b
    )
}