package POOejercicios.persona

class Persona2 {
    var nombre:String=""
        get() = field
        set(value) {
            field = value
        }
    var edad:Int=0
        get() = field
        set(value) {
            field = value
        }

    constructor(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }


    override fun toString(): String {
        return "Persona2(nombre='$nombre', edad=$edad)"
    }
    fun mayorEdad(){
        if (this.edad>=18) println("La persona es mayor de edad")
        else println("La persona NO es mayor de edad")
    }


}