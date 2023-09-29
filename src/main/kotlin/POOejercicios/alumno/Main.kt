package POOejercicios.alumno

fun main() {
    var alumno1:Alumno=Alumno("Antonio",9.30)
    var alumno2:Alumno=Alumno("Javier",3.30)
    var alumno3=Alumno()



    println(alumno1.toString())
    println(alumno2.toString())
    println(alumno3.toString())

    print("El alumno ${alumno2.getNombre()}, ")
    alumno2.calificacion()
}


