package POOejercicios.alumno

class Alumno(private var nombre:String="Andres", private var nota:Double=5.0) {


    fun Alumno(){
        nombre="Anonimo"
        nota=5.00

    }
    fun getNombre():String{
        return this.nombre
    }

    fun getNota():Double{
        return this.nota
    }

    fun setNombre(nombre:String){
        this.nombre=nombre
    }

    fun setNota(nota: Double){
        this.nota=nota
    }

    override fun toString(): String {
        return "Alumno(nombre='$nombre', nota=$nota)"
    }
    fun calificacion(){
        if(nota<=4) println("La calificacion es de regular")
    }

}