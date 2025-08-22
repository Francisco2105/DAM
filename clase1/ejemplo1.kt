fun main(){
    println("inicio de programa")
    val A = 5
    val B = 3

    sumar(A, B)
    sumar(9,6)
    sumar(4,7)
    sumar(93, 1)

    restar(A, B)
    restar(9,6)
    restar(4,7)
    restar(93, 1)

    multi(A, B)
    multi(9,6)
    multi(4,7)
    multi(93, 1)




}

fun sumar(A:Int, B:Int){
    print("estoy en el program de sumar - voy a sumar $A con $B = ")
    println("sum: "+(A+B))

}


fun restar(A:Int, B:Int){
    print("estoy en el program de restar - voy a restar $A con $B = ")
    println("res: "+(A-B))

}
fun multi(A:Int, B:Int){
    print("estoy en el program de multi - voy a multiplicar $A con $B = ")
    println("res: "+(A*B))

}