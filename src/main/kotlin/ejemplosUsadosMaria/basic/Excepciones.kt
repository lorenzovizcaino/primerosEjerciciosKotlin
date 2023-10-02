package ejemplosUsadosMaria.basic

//https://www.develou.com/excepciones-en-kotlin/

fun main() {
    print("Escribe el texto: ")
    val userInput = readLine()
    println("Cantidad de digitos: ${countDigits(userInput)}")

    println("Cantidad de digitos v2: ${countDigits2(userInput)}")

    /*
    * Al igual que en Java, Kotlin te permite capturar excepciones con la expresión try..catch..finally.

Pon en el bloque try el código que es propenso a lanzar excepciones y luego añade bloques catch que verifiquen la aplicabilidad de un subtipo de excepción.

El bloque finally se ejecuta luego de que se aplique o no algún bloque catch. Normalmente aquí liberas los recursos que has tomado del sistema y limpias referencias para evitar fugas de memoria.

Tomemos como ejemplo la conversión de un String a Double.
* Supongamos que deseamos crear una función de extensión que envuelva a la función String.toDouble() para que retorne un valor por defecto en caso de que se lance una excepción del tipo NumberFormatException.
    * */

    println("5.3".toDoubleOrDefault(1.0))
    println("5.".toDoubleOrDefault(1.0))
    println(".3".toDoubleOrDefault(1.0))
    println("dos".toDoubleOrDefault(1.0))

    println("?".toDoubleOrDefault(1.0))

}

fun countDigits(userInput: String?): Int {
    if (userInput.isNullOrBlank()) {
        throw IllegalArgumentException("Entrada inválida, la palabra debe tener al menos un carácter")
    }
    return userInput.count(Char::isDigit)
}

//como expresión
fun countDigits2(userInput: String?) =
    if (userInput.isNullOrBlank())
        throw IllegalArgumentException("Entrada inválida2, la palabra debe tener al menos un carácter")
    else
        userInput.count(Char::isDigit)


fun String.toDoubleOrDefault(defaultValue: Double): Double {
    return try {
        toDouble()
    } catch (e: NumberFormatException) {
        defaultValue
    }
}

//como expresión
fun String.toDoubleOrDefault2(defaultValue: Double) = try {
    toDouble()
} catch (e: NumberFormatException) {
    defaultValue
}

/*
* Excepciones Marcadas
Kotlin no diferencia entre excepciones marcadas y no marcadas (checked y unchecked).
* Las funciones no deben especificar explícitamente que tipo de excepción lanzaran (como el uso de la cláusula throws en la firmas de métodos en Java),
* ni tampoco se te obliga a atrapar excepciones.

Esto quiere decir que cuando escribes sentencias que invoquen operaciones que lancen excepciones marcadas desde el SDK de Java,
* el compilador de Kotlin no te resaltará su uso sin bloque try..catch.
*  Por ejemplo, como intentar abrir un archivo que no existe.
* */