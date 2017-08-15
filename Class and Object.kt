
class student {
    var name : String = "" // ALWAYS SHOULD ASSIGN A VALUE IF IT IS NOT THEN IT PRODUCE ERROR
    var id : Int = 0
    var session  = ""

    fun assign(n : String, i : Int, s : String){
        name = n
        id = i
        session = s
    }

    fun print(){
        println("NAME: $name")
        println("ID: $id")
        println("SESSION: $session")
    }
}

fun main(args : Array<String>){

    var st = student() // CREATING OBJECT OF A CLASS
    st.assign("Hridoy", 15010, "2014-2015") // PASSING THE ARGUMENTS
    //st.assign(i = 15010, n = "Hridoy", s = "2014-2015") // PASS ARGUMENTS IN DISORDER
    st.print()

}

/* OUTPUT:
NAME: Hridoy
ID: 15010
SESSION: 2014-2015
*/
