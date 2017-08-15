
fun main(args : Array<String>){

    var a = 5
    var b = 8

    // IF ELSE STATEMENTS
    if (a == b){
        println("a is equal to b")
    } else {
        println("a is not equal to b")
    }

    // *NEW FEATURE* INITIALIZING A VARIABLE BY USING IF ELSE STATEMENTS
    var result = if (a > b){
        a
    } else {
        b
    }

    println("Result is: "+result)

    b = 2

    // WHEN STATEMENTS JUST LIKE SWITCH STATEMENTS IN JAVA & C++
    when(b){
        1 -> println("One")
        2 -> println("Two")
        3, 4 -> println("Three & Four")
        else -> println("More than Four")
    }

    // *NEW FEATURE* INITIALIZING A VARIABLE BY USING WHEN STATEMENTS
    var str : String = when(a){
        1, 2, 3, 4 -> "One, two, three or four"
        5 -> "Five"
        else -> "Nothing"
    }

    println(str)
}

/* OUTPUT:
a is not equal to b
Result is: 8
Two
Five
 */
