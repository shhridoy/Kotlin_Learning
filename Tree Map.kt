import java.util.*

fun main(args : Array<String>){

    var tree = TreeMap<String, Int>()
    tree["Key1"] = 100
    tree["Key2"] = 200
    tree["Key3"] = 300

    for ((key, value) in tree)
        println(key + " " + value.toString())

}

/* OUTPUT:
Key1 100
Key2 200
Key3 300
*/
