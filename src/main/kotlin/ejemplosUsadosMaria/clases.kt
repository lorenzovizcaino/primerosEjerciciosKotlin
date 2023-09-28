package Pto2_ProgOrientadaObjetos.paraEjercicios

//fuente - https://www.develou.com/clases-en-kotlin/

/*
* En Kotlin, una clase es una agrupación de propiedades (atributos) y funciones (métodos) miembro, que actúan como una plantilla para la instanciación de objetos.

La declaración de una clase se compone de:

Nombre de la clase
Cabecera
Cuerpo
Para definirla, usa la palabra clave class seguido de su nombre.
* */

class Supervisor {
    /**Cuerpo de clase**/
}

/*La anterior declaración está en una forma reducida. Sin embargo, la declaración de la cabecera puede llevar más elementos como:

Modificadores
Declaración de parámetros
Constructor primario
Herencia
Restricciones de tipo
En la gramática de Kotlin, esos elementos de la cabecera y el bloque de código para el cuerpo son opcionales. Por lo que incluso podrías reducir la declaración a:
*/
//class Supervisor

/*
* Problema
Supón que estamos creando un juego, donde un avión se mueve en dos dimensiones a lo largo de un límite de [300,300]. Su posición inicial debe ser [0,0].

El objetivo es modelar dicho avión, junto a su información de coordenadas y permitir modificarlas dependiendo de la dirección en que se desplaza.

Solución
Al analizar el enunciado, sabrás que la clase Avion (Plane) se estructura así

Atributos

Posición en eje x
Posición en eje y
*
Métodos
*
Movimientos hacia la izquierda — Restar la unidad al eje x. Evitar el decremento menor a 0
Movimiento hacia la derecha — Sumar la unidad al eje x. Evitar el incremento superior a 300
Movimiento hacia arriba — Restar la unidad al eje y. Evitar decrementos menores a 0
Movimiento hacia abajo — Sumar la unidad al eje y. Evitar incrementos mayores a 300
La siguiente es una de las posibles soluciones en código, al anterior análisis:
*
*
* * */

class Plane {
    var x: Int = 0
        private set
    var y: Int = 0
        private set

    fun moveLeft() {
        x -= if (x == 0) 0 else 1
    }

    fun moveRight() {
        x += if (x == 300) 0 else 1
    }

    fun moveUp() {
        y -= if (y == 0) 0 else 1
    }

    fun moveDown() {
        y += if (y == 300) 0 else 1
    }
}

//Los atributos x e y se definen como propiedades mutables con var y de tipo Int.
//
//Cada método es una función miembro sin retorno que altera los ejes, a través de una expresión if que bifurca las condiciones del diseño.

//Crear Instancias De Clases
//Para crear una instancia de una clase, usa una llamada regular de funciones para el constructor.

val plane = Plane()
/*
Puedes acceder a la propiedad miembro con la notación instancia.propiedad.

plane.x
Por ejemplo:

Simular el desplazamiento Derecha > Derecha > Abajo > Arriba > Izquierda de un avión. Luego imprimir su posición final.

 */

fun main() {
    val plane = Plane()
    plane.moveRight()
    plane.moveRight()
    plane.moveDown()
    plane.moveUp()
    plane.moveLeft()

    println("Posición actual del avión: (${plane.x},${plane.y})")
}