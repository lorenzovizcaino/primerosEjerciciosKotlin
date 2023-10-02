package ejemplosUsadosMaria.basic
// fuentes: https://cursokotlin.com/capitulo-8-expresion-when-kotlin/
//          https://www.develou.com/expresion-when-en-kotlin/
fun main(args: Array<String>) {
    getMonth(2)
    getMonthTrimestre(2)
    getMonthSemestre(1)
    println()
    resultTipoVal(3)
    resultTipoVal(true)
    resultTipoVal("Maria")
    resultGuardadoAutomatico(7)
}
fun getMonth(month : Int){
    when (month) {
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> print("Noviembre")
        12 -> print("Diciembre")
        else -> {
            print("No corresponde a ningún mes del año")
        }
    }
}

fun getMonthTrimestre(month : Int){
    when (month) {
        1,2,3 -> print("Primer trimestre del año")
        4,5,6 -> print("segundo trimestre del año")
        7,8,9 -> print("tercer trimestre del año")
        10,11,12 -> print("cuarto trimestre del año")
    }
}

fun getMonthSemestre(month : Int){
    when (month) {
        in 1..6 -> print("Primer semestre")
        in 7..12 -> print("segundo semestre")
        !in 1..12 -> print("no es un mes válido")
    }
}

fun resultTipoVal(value: Any){
    when (value){
        is Int -> println(value + 1)
        is String -> println("El texto es $value")
        is Boolean -> if (value) println("es verdadero") else print("es falso")
    }
}

fun resultGuardadoAutomatico(month : Int){
    val response : String = when (month) {
        in 1..6 -> "Primer semestre"
        in 7..12 -> "segundo semestre"
        !in 1..12 -> "no es un mes válido"
        else ->  "error"
    }
}

fun respuesta() {
    val input = 'y'

    when (input) {
        'y' -> print("Continuando...")
        'n' -> print("Cerrando...")
        else -> print("Entrada inválida")
    }
}

//múltiples valores
fun quenda() {
    val input = 2

    when (input) {
        1, 2, 3 -> print("Te toca turno nocturno")
        4, 5, 6 -> print("Te toca turno diurno")
    }
}

//expresión como condición
fun limiteChar() {
    val input = 100

    when (input) {
        Char.MAX_VALUE.toInt() -> print("Límite superior")
        Char.MIN_VALUE.toInt() -> print("Límite inferior")
        else -> print("No es ninguno de los límites")
    }
}

//rangos
fun validacionId() {
    print("Ingresa el número:")
    val input = readLine()!!.toInt()

    when (input) {
        in 1..49 -> print("$input pertenece a [1..49]")
        in 50..99 -> print("$input pertence a [50..99]")
        else -> print("Fuera de los rangos contemplados")
    }
}

//comparar tipos
fun tipoRptaForm() {
    val formResponse: Any = 12

    when (formResponse) {
        is Int -> print("Respuesta Entera")
        is String -> print("Respuesta String")
    }
}

//Usar el código anterior y multiplicar los resultados por 100, sin importar el tipo.
fun tipoRptaFormApp() {
    val formResponse: Any = "12"

    when (formResponse) {
        is Int -> {
            val times = formResponse * 100
            print("Respuesta Entera:$times")
        }
        is String -> {
            val times = formResponse.toInt() * 100
            print("Respuesta String:$times")
        }
    }
}

//usado como if
fun evaluarValor() {
    val a = -5

    when {
        a > 0 -> print("Es positivo")
        a == 0 -> print("Es cero")
        else -> print("Es negativo")
    }
}

//variable en el sujeto
fun juego() {
    val playerLucky = 0.2
    val bonus = 0.3

    when (val damage: Double = playerLucky + bonus) {
        in 0.0..0.3 -> print("Daño recibido:${damage * 10}")
        in 0.3..0.6 -> print("Daño recibido:${damage * 20}")
        in 0.6..1.0 -> print("Daño recibido:${damage * 30}")
    }
}

//como expresión
//ej. notas
fun calificaciones() {
    val markNumber = 4

    val markText = when (markNumber) {
        1 -> "Insuficiente"
        2 -> "Deficiente"
        3 -> "Aceptable"
        4 -> "Sobresaliente"
        5 -> "Excelente"
        else -> "No permitido"
    }

    print("La calificación es: $markText")
}

//Ejercicio porcentajes