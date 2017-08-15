
fun main(args : Array<String>){

    var name : String = "Saiful Haque Hridoy"

    println(name.length) //PRINTING THE LENGTH OF STRING

    // CHECKING TWO STRING VARIABLE
    var bool : Boolean = if (name.equals("Saiful haque Hridoy")){
        true
    } else {
        false
    }

    println(bool)

    // CHECKING TWO STRING VARIABLE AND IGNORE CASE SENSITIVITY
    var eq = if (name.equals("Saiful haque Hridoy", true)){
        "Strings are equal"
    } else {
        "Strings aren't equal"
    }

    println(eq)

    println(name.substring(0..5)) // PRINTING THE SUBSTRING
    println("My name is $name") // ANOTHER WAY TO CONCAT STRING
}

/* OUTPUT:
19
false
Strings are equal
Saiful
My name is Saiful Haque Hridoy
*/
