
fun main(args : Array<String>){

    var a = "45ab"
    var b : Int = 0

    try {
        b = a.toInt()
    } catch (e : NumberFormatException){
        println("The number is not valid")
    }

    println(b)
}

/* OUTPUT:
The number is not valid
0
*/
