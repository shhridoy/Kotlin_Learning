
fun main(args : Array<String>){

    var list = listOf(10, "Eleven", 12, 13, "Fourteen", 15, 16) // FOR SPECIFY THE TYPE USE listOf<String/Int/etc.>
    for ((index,li) in list.withIndex()){ // ACCESSING WITH INDEX
        println("$index  $li")
    }

}

/* OUTPUT:
0  10
1  Eleven
2  12
3  13
4  Fourteen
5  15
6  16
*/
