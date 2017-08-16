class student {
    var name : String = ""
    var id : Int = 0
}


fun main(args : Array<String>){

    var s = student()
    var s2 = student()

    s.name = "Papia"
    s.id = 26
    s.show()

    s2.id = 14
    s2.name = "Sultana"

    var con = s.concat(s2) // NORMAL FUNCTION CALL
    var sum = s infixAdd s2 // INFIX FUNCTION CALL
    println("$con\n$sum")
}

// EXTENDED FUNCTIONS
fun student.show (){
    println(this.name+ "\n"+this.id)
}

// INFIX FUNCTION
infix fun student.infixAdd (s : student) : Int{
    return this.id + s.id
}

// NORMAL FUNCTION
fun student.concat (St : student) : String = this.name + " " + St.name

/* OUTPUT:
Papia
26
Papia Sultana
40
*/
