
fun main(args : Array<String>){

    // DEFINE RANGES IN KOTLIN
    var range1 = 1..5 // 1,2,3,4,5
    var range2 = 1..5 step 2 // 1,3,5
    var range3 = 5 downTo 1 // 5,4,3,2,1
    var range4 = 5.downTo(2) step 1 // 5,4,3,2 CALLING BY FUNCTION

    println("Range 1: ")
    for (r in range1){
        print(r)
        print(" ")
    }

    println("\nRange 2: ")
    for (r in range2){
        print(r)
        print(" ")
    }

    println("\nRange 3: ")
    for (r in range3){
        print(r)
        print(" ")
    }

    println("\nRange 4: ")
    for (r in range4){
        print(r)
        print(" ")
    }

    println("\nRange 1 to reversed: ")
    for (r in range1.reversed()){
        print(r)
        print(" ")
    }
}
/* OUTPUT:
Range 1: 
1 2 3 4 5 
Range 2: 
1 3 5 
Range 3: 
5 4 3 2 1 
Range 4: 
5 4 3 2 
Range 1 to reversed: 
5 4 3 2 1 
*/
