
class student {
    var name : String? = null // ASSIGNING NULL TO A VARIABLE
    var id : Int? = null
    var session : String? = null

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
    //st.assign(i = 15010, n = "Hridoy", s = "2014-2015") // PASS ARGUMENTS IN DISORDER
    st.print()
    
    st.assign("Hridoy", 15010, "2014-2015") // PASSING THE ARGUMENTS
    st.print()

}

/* OUTPUT:
NAME: null
ID: null
SESSION: null

NAME: Hridoy
ID: 15010
SESSION: 2014-2015
*/
