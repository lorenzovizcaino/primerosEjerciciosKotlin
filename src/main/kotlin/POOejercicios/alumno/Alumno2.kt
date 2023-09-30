package POOejercicios.alumno

class Alumno2 {

    var nombre:String=""
        get() = field

        set(nombre) {field=nombre}

    var nota:Double = 0.0
        get() =field
        set(nota) {field=nota}

    constructor(nombre: String, nota: Double) {
        this.nombre = nombre
        this.nota = nota
    }

    constructor()


    override fun toString(): String {
        return "Alumno2(nombre='$nombre', nota=$nota)"
    }
    fun calificacion(){
        if(nota<=4) println("La calificacion es de regular")
    }

}