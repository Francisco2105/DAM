package clase1
fun main(){
    println("inicio de programa")
    val A = 5
    val B = 3

    val sum = A+B
    val res = A-B
    val mul = A*B
    val div = A/B
    val mod = A % B

    println("estoy en suma")
    println("sum: $sum")

    println("estoy en resta")
    println("res: $res")

    println("estoy en multiplicacion")
    println("mul: $mul")

    println("estoy en division")
    println("div: $div")

    println("estoy en modulo")
    println("mod: $mod")

}

fun sumar(A:Int, B:Int){
    print("estoy en el program de sumar - voy a sumar $A con $B = ")
    println("sum: "+(A+B))

}