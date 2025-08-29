fun main(){
    val charmander = pokemon("charmander", 40, 100)
    val mewtwo = pokemon("mewtwo", 300,450)
    charmander.informacion()
    mewtwo.informacion()

    charmander.sePreparaParaLaBatalla()
    charmander.recibeDanos(charmander.atk)

    mewtwo.sePreparaParaLaBatalla()
    mewtwo.recibeDanos(mewtwo.atk)
}
class pokemon(
    val  nombre: String,
    var atk: Int,
    var hp: Int
) {
    fun sePreparaParaLaBatalla() {
        println("el $nombre se prepara para la batalla")
    }

    fun informacion() {
        println("nombre:$nombre ATK:$atk HP:$hp")
    }

    fun recibeDanos(dano: Int) {
        println("$nombre recibe $dano puntos de daño")
        hp = hp - dano
        println("ahora le quedan $hp de puntos")
        if (hp < 0){
            println("$nombre SE HA DEBILITADO")
    }
}
}

