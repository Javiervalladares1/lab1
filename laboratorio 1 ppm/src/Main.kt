/*fun main() {
    print("Ingresa un número: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        val binaryNumber = decabin(numero)
        println("$numero en binario es: $binaryNumber")
    }
}
fun decabin(number: Int): String {
    return Integer.toBinaryString(number)
}
*/

fun main() {
    print("Escribe varias palabras y sepáralas por comas: ")
    val listapal = readLine().toString()
    val minlistapal = listapal.lowercase()
    val delim = ","
    var cantidadpal = 0
    var cantpalcon = 0
    var palabrasConDosVocalesDistintas = 0
    val list = minlistapal.split(delim).map { it.trim() } // Trimming extra spaces around words
    val vocales = listOf('a', 'e', 'i', 'o', 'u')
    println(list)
    for (i in list) {
        if (i == i.reversed()) {
            cantidadpal += 1
        }
        if (i.isNotEmpty() && i[0] !in vocales) {
            cantpalcon += 1
        }
        if (contarVocalesDistintas(i, vocales) >= 2) {
            palabrasConDosVocalesDistintas += 1
        }
    }
    println("De las palabras que ingresaste, $cantidadpal son palíndromas")
    println("De las palabras que ingresaste, $cantpalcon empiezan con consonante")
    println("De las palabras que ingresaste, $palabrasConDosVocalesDistintas contienen al menos dos vocales distintas")
}

fun contarVocalesDistintas(palabra: String, vocales: List<Char>): Int {
    val vocalesEncontradas = mutableSetOf<Char>()
    for (letra in palabra) {
        if (letra in vocales) {
            vocalesEncontradas.add(letra)
        }
    }
    return vocalesEncontradas.size
}

