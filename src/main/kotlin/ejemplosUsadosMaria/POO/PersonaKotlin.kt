package ejemplosUsadosMaria.POO

class PersonaKotlin(val nombre: String) {
    var edad = 0
        set(edad) {
            field = if (edad > 0) edad else throw RuntimeException("Edad no válida")
        }

}