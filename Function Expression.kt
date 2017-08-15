
fun main(args : Array<String>){

    var result = add2(5,2)
    println(result)
    var name : String = concat("SH", "Hridoy")
    println(name)
}

// NORMAL FUNCTION RETURNING A VALUE
fun add(a : Int, b : Int) : Int {
    return a+b
}

fun concat (str1:String, str2:String) : String = str1+" "+str2

// *NEW FEATURE*
fun add2 (a : Int, b : Int) : Int = a+b

/* OUTPUT:
7
SH Hridoy
*/
