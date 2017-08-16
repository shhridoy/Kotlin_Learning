class Employee(n: String) { // PRIMARY CONSTRUCTOR
    var name : String = ""
    var id : Int = 0

    // init IS USED FOR INITIALIZING THE PRIMARY CONSTRUCTOR DATA
    init {
        name = n.capitalize() // TO TURN THE FIRST LETTER IN CAPITAL
        id = 100
    }

    constructor(n:String, i:Int) : this(n) {
        id = i
    }

    constructor() : this(n="", i=0) {}

    fun show (){
        println("Name: "+name)
        println("Id: "+id)
    }
}


fun main(args : Array<String>){

    var em1 = Employee()
    var em2 = Employee("Sorif")
    var em3 = Employee("Sorif", 12)
    em1.show()
    em2.show()
    em3.show()

}

/* OUTPUT:
Name: 
Id: 0
Name: Sorif
Id: 100
Name: Sorif
Id: 12
*/
