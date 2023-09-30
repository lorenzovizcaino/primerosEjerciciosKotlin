package POOejercicios.alumno

fun main() {
    var alumno1:Alumno2=Alumno2("Antonio",9.30)
    var alumno2:Alumno2=Alumno2("Javier",3.30)
    var alumno3=Alumno2()





    println(alumno1.toString())
    println(alumno2.toString())
    println(alumno3.toString())

    print("El alumno ${alumno2.nombre}, ")
    alumno2.calificacion()
}


