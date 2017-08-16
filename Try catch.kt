
fun main(args : Array<String>){

    var a = "45ab"
    var b : Int = 0

    try {
        b = a.toInt()
    } catch (e : NumberFormatException){
        println("The number is not valid")
    }
    
    println(b)
    
    var c = try {
        "22".toInt()
    } catch (exception : NumberFormatException) {
        0
    }
    
    println(c)
}

/* OUTPUT:
The number is not valid
0
22
*/
