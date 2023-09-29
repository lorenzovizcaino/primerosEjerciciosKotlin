package POOejercicios.persona

class Persona (private var nombre:String, private var edad:Int) {

    fun Persona(nombre:String, edad:Int){
        this.nombre=nombre
        this.edad=edad
    }

    override fun toString(): String {
        return "Persona(nombre='$nombre', edad=$edad)"
    }

    fun mayorEdad(){
        if (this.edad>=18) println("La persona es mayor de edad")
        else println("La persona NO es mayor de edad")
    }

}