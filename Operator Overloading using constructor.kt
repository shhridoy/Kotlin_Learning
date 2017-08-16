
class Employee (n : String, i : Int) {
    var name : String = ""
    var id : Int = 0

    // init IS USED FOR INITIALIZING THE OBJECT DATA
    init {
        name = n.capitalize() // TO TURN THE FIRST LETTER IN CAPITAL
        id = i
    }

    fun show (){
        println("Name: "+name)
        println("Id: "+id)
    }

    // OPERATOR OVERLOADING (+)
    operator fun plus (em : Employee) : Employee{
        var obj = Employee(this.name+" "+em.name, this.id+em.id)
        return obj
    }
}

fun main(args : Array<String>){

    var em1 = Employee("MD.", 12)
    var em2 = Employee("rahim", 45)

    var em3 = em1 + em2
    em3.show()

}

/* OUTPUT:
Name: MD. Rahim
Id: 57
*/
