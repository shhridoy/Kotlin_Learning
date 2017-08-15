
fun main(args : Array<String>){

    println("Hello"); // it is no essential to end statements with semicolon (;)
    println("Hello") // it is also right way and better way i think

    // if we want to write two statements in a line then we need to separate them with semicolon

    // CREATING VARIABLES BY SPECIFIC VARIABLE TYPE
    var st : String = "I am string"
    var int : Int = 5
    var fl : Float = 4.4f
    var dou : Double = 23.33
    var ch : Char = 'A'
    println("\n"+ch)
    ch = 'B' // modify the value
    println(ch)

    // creating variables without specifying variable types and compiler takes care of its type
    var name = "Nochiketa charkraborty"
    var value = 23

    // creating a constant variable who's value can't be changed just like final in java
    val const = 77 // or val const : Int = 77
    // const = 55; ERROR BECAUSE OF CONSTANT VARIABLE


    // ARRAY OF UNSPECIFIED AND DIFFERENT VARIABLE TYPES
    var array1 = arrayOf(1, 2.3, "Hi", 3.22, 1, 'A')

    println("\nArray1: ")
    for (x in array1){ // FOR EACH LOOP
        println(x)
    }

    // ARRAY OF SPECIFIED AND SAME VARIABLE TYPE
    var array2 : Array<String> = arrayOf("Hridoy", "Robin", "Fahad")

    println("\nArray2: ")
    for (x in array2){
        println(x)
    }

}

/* OUTPUT:
Hello
Hello

A
B

Array1:
1
2.3
Hi
3.22
1
A

Array2:
Hridoy
Robin
Fahad
*/