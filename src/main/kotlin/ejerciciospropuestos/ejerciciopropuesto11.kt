package ejerciciospropuestos/*
Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información:
cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente.
Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo según
el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:

	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.

 */

fun main() {
    var numPreguntas:Int
    var numPreguntasCorrectas:Int
    var porcentaje:Float
    println("Numero de preguntas realizadas")
    numPreguntas= readln().toInt()
    println("Numero de preguntas contestadas correctamente")
    numPreguntasCorrectas= readln().toInt()
    if(numPreguntasCorrectas>numPreguntas){
        println("ERROR, No puede contestar mas preguntas correctas que las realizadas")
    }else{
        porcentaje= ((100*numPreguntasCorrectas)/numPreguntas).toFloat()
        if(porcentaje>=90) println("Nivel Maximo")
        else if(porcentaje>=75 && porcentaje<90) println("Nivel Medio")
        else if(porcentaje>=50 && porcentaje<75) println("Nivel Regular")
        else println("Fuera de Nivel")
    }
}

//vamos a empezar el punto 8