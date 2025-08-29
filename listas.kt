fun main(){
    var lista = mutableListOf(1,1,3,4,5)
    println("lista: $lista")

    for (i  in lista) {
        println("el elemento de la lista es: $lista")
    }


    var filtrado = lista.filter {  it % 2 ==0 }//muestra la lista de numeros
    println("filtado: $filtrado")

    var doble = lista.map {  it +1 }//muestra los numero que vendrian despues
    println("doble: $doble")

    var sumatoria = lista.sum() //te suma todos los numeros dentro de la lista
    println("sumatoria: $sumatoria")

    var buscaElpar = lista.find { it % 2 ==0 }//esto ayuda a buscar el numero par
    println("buscaElpar: $buscaElpar")

    var primerElemento = lista.first()//aqui te indica el primer numero de la lista
    println("primerElemento: $primerElemento")

    var ultimoElemento = lista.last()//aqui te indica el ultimo numero de la lista
    println("ultimoElemento: $ultimoElemento")

    println()
    println("----SET----")


    var mapa = mapOf("nombre" to "juan", "edad" to 9, "dolares" to 1000)
    println("mapa: $mapa")

    var informacion = mapOf("nombre" to "fernanda", "edad" to 28)
    informacion.forEach{
        (llave, valor) -> println("la llave es $llave y el valor es $valor")
    }



}
