package ejerciciosMaria_24sep23

fun main() {
    //TodosNumerosMenores10()
    //AlgunosNumerosMenores10()
    //Cuadrantes()
    //MenorDeTresNumeros()
    //notasConWhile()
    //alturasPersonasConWhile()
    //paresImparesWhile()
    bancoDoWhile()
    //triangulosFor()
    //AnalizarNumerosFor()
    //positivoNegativoNuloWhen()
    //mayor3ValoresWhen()
    //triangulosWhen()
    //HijosFamiliasWhen()
    //tresFunciones()
    //subrayarString()
    //sumarConFuncionPorDefecto()
    //funcionesNombradas()
    //tablaMultiplicarNombrada()
    //operariosArrays()
    //AlturaPersonasArrays()
    //ArrayOrdenado()
    //ArrayPrimeroUltimo()
    //Array5Elementos()
    //Array2Funciones()
    //Array8Elementos()
    //SumaDosArrays()
    ArraysSumaSueldosOperarios()

}
/*
Se desea almacenar los sueldos de operarios.
Cuando se ejecuta el programa se debe pedir la cantidad de sueldos a ingresar.
Luego crear un array con dicho tamaño.
Definir una función de carga y otra de impresión.
 */
fun ArraysSumaSueldosOperarios() {
    var numSueldos=0
    println("Cantidad de sueldos a ingresar")
    numSueldos= readln().toInt()
    var array= arrayOfNulls<Double>(numSueldos)
    llenarArrayDouble(array)
    imprimirArrayDouble(array)
}

fun imprimirArrayDouble(array: Array<Double?>) {
    for (i in 0..array.size-1){
        println("El sueldo alojado en la posicion $i del array es: ${array[i]}")
    }
}

fun llenarArrayDouble(array: Array<Double?>) {
    var sueldo:Double=0.0
    for(i in 0..array.size-1){
        sueldo=(Math.random()*1000)+700
        array[i]=Math.round(sueldo*100)/100.toDouble()

    }

}

/*
Realizar un programa que pida la carga de dos array numéricos enteros de 4 elementos.
Obtener la suma de los dos arreglos elemento a elemento,
dicho resultado guardarlo en un tercer arreglo del mismo tamaño.

 */
fun SumaDosArrays() {
    var array1= arrayOfNulls<Int>(4)
    var array2= arrayOfNulls<Int>(4)
    var arraySuma= arrayOfNulls<Int>(2)
    var suma1=0
    var suma2=0
    llenarArray(array1)
    llenarArray(array2)
    for (i in array1){
        suma1+=i!!
    }
    for (i in array2){
        suma2+=i!!
    }
    arraySuma[0]=suma1
    arraySuma[1]=suma2
    for(i in arraySuma){
        println(i)
    }




}

/*
Desarrollar un programa que permita ingresar un array de 8 elementos enteros, e informe:
 - El valor acumulado de todos los elementos.
 - El valor acumulado de los elementos que sean mayores a 36.
 - Cantidad de valores mayores a 50.
(Definir dos for, en el primero realizar la carga y en el segundo proceder a analizar cada elemento)
 */
fun Array8Elementos() {
    val tamanhoArray=8
    var array= arrayOfNulls<Int>(tamanhoArray)
    var suma:Int=0
    var sumaMayor36:Int=0
    var sumaMayor50:Int=0
    for(i in 0..array.size-1){
        array[i]=(Math.random()*100).toInt()
        println(array[i])
    }
    for(i in array){
        suma+=i!!
        if(i!!>36){
            sumaMayor36+=i
        }
        if(i!!>50)
            sumaMayor50+=i

    }
    println("La suma de todos los numeros del array es: $suma")
    println("Numeros del array mayores de 36: $sumaMayor36")
    println("Numeros del array mayores de 50: $sumaMayor50")

}

/*
Definir en la función main un array de enteros de 5 elementos.
Declarar dos funciones, en una efectuar la carga de sus elementos y en la otra su impresión..
 */
fun Array2Funciones() {
    var array= arrayOfNulls<Int>(5)
    llenarArray(array)
    imprimirArray(array)
}




fun imprimirArray(array: Array<Int?>) {
    for (i in 0..array.size-1){
        println("El valor de la posicion $i del array es ${array[i]}")
    }
}

fun llenarArray(array: Array<Int?>) {
    var valor:Int
    for (i in 0..array.size-1){
        println("Dame el valor para la posicion $i del array")
        valor= readln().toInt()
        array[i]=valor
    }

}
/*
Cargar un array de 5 elementos de tipo entero. Imprimir luego todo el array.
 */



fun Array5Elementos() {
    var array:Array<Int> = arrayOf(20,30,40,50,60)
    for(i in 0..array.size-1){
        println("La posicion $i del array es ${array[i]}")
    }
    println()
    var contador=0
    for(i in array){
        println("La posicion $contador del array es $i")
        contador++
    }
}
/*
Cargar un array de 10 elementos de tipo entero. Imprimir luego el primer y último elemento.
 */
fun ArrayPrimeroUltimo() {

    var array:Array<Int> = arrayOf(4,5,6,89,45,23,45,2,6,90)
    println("El primer elemento del array es ${array.first()}")
    println("El ultimo elemento del array es ${array.last()}")
}

/*
Cargar un array de 10 elementos de tipo entero y verificar posteriormente si el mismo está ordenado de menor a mayor.
 */
fun ArrayOrdenado() {
    var ordenArray1:Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var ordenArray2:Array<Int> = arrayOf(1,20,3,4,5,6,70,8,9,10)
    ComprobarArray(ordenArray1)
    ComprobarArray(ordenArray2)

}

fun ComprobarArray(ordenArray: Array<Int>) {
    var bandera:Boolean=true
    var primerInt=ordenArray[0]
    for (i in 0..ordenArray.size-1){
        if(ordenArray[i]<primerInt) {
            bandera=false
            break
        }else{
            primerInt=ordenArray[i]
        }
    }
    if(bandera) println("Los numeros del array estan ordenados")
    else println("Los numeros del array no estan ordenados")
}

/*
Definir un array de 5 componentes de tipo Float que representen las alturas de 5 personas.
Obtener el promedio de las mismas.
Contar cuántas personas son más altas que el promedio y cuántas más bajas.
 */
fun AlturaPersonasArrays() {
    var alturaPersonas:Array<Float> = arrayOf(1.80f,1.65f,2.02f,1.54f,1.71f)
    var sumaAlturas:Float=0.0f
    var promedioAlturas:Float=0.0f
    var personasMasAltasPromedio:Int=0
    var personasMasBajasPromedio:Int=0
    for (i in 0..alturaPersonas.size-1){
        sumaAlturas+=alturaPersonas[i]
    }
    promedioAlturas=sumaAlturas/alturaPersonas.size
    val promedioFormateado=String.format("%.2f",promedioAlturas)
    println("Promedio de las alturas del array: $promedioFormateado")


    for (i in 0..alturaPersonas.size-1){
        if(alturaPersonas[i]>promedioAlturas) personasMasAltasPromedio++
        else personasMasBajasPromedio++
    }
    println("Personas mas altas que el promedio $personasMasAltasPromedio")
    println("Personas mas bajas que el promedio $personasMasBajasPromedio")
}

/*
Se desea guardar los sueldos de 5 operarios.
Según lo conocido deberíamos definir 5 variables si queremos tener en un cierto momento los 5 sueldos almacenados en memoria.
Empleando un arreglo solo se requiere definir un único nombre y accedemos a cada elemento por medio del subíndice.
 */
fun operariosArrays() {
    var sueldos: Array<Double> = arrayOf(200.34,100.45,300.56,200.00)
    for(i in 0..sueldos.size-1){
        println("Sueldo ${i+1} = ${sueldos[i]}")
    }

}

/*
Elaborar una función que muestre la tabla de multiplicar del valor que le enviemos como parámetro.
Definir un segundo parámetro llamado termino que por defecto almacene el valor 10.
Se deben mostrar tantos términos de la tabla de multiplicar como lo indica el segundo parámetro.

Llamar a la función desde la main con argumentos nombrados.
 */
fun tablaMultiplicarNombrada() {
    Multiplicando(6,5)
    Multiplicando(7)
    Multiplicando(termino = 4, valor = 10)
}

fun Multiplicando(valor: Int, termino: Int=10) {
    println("TABLA DEL $valor CON $termino TERMINOS")
    for(i in 0..termino-1){
        println("$valor x $i = ${valor*i}")
    }
    println()

}

/*
Confeccionar una función que reciba el nombre de un operario, el pago por hora y la cantidad de horas trabajadas.
Debe mostrar su sueldo y el nombre. Hacer la llamada de la función mediante argumentos nombrados.
 */
fun funcionesNombradas() {
    CalcularSueldo("Antonio",15,160)
    CalcularSueldo(precioHora = 12, nombre = "Luis", horasTrabajadas = 300)
    CalcularSueldo(horasTrabajadas = 120, precioHora = 20, nombre = "Maria")
}

fun CalcularSueldo(nombre: String, precioHora: Int, horasTrabajadas: Int) {
    println("EL sueldo del trabajador: $nombre es de ${precioHora*horasTrabajadas} Euros")
}

/*
Confeccionar una función que reciba entre 2 y 5 enteros.
La misma nos debe retornar la suma de dichos valores. Debe tener tres parámetros por defecto.
 */
fun sumarConFuncionPorDefecto() {
    sumar(2,3,4,5,6)
    sumar(2,3,4)
    sumar(2,3)
}

fun sumar(i: Int, i1: Int, i2: Int=0, i3: Int=0, i4: Int=0) {
    println("la suma de la funcion es: ${i+i1+i2+i3+i4}")
}

/*
Confeccionar una función que reciba un String como parámetro y en forma opcional un segundo String con un caracter.
La función debe mostrar el String subrayado con el caracter que indica el segundo parámetro
 */
fun subrayarString() {
    subrayando("Departamento Finanzas","*")
    subrayando("Departamento de contabilidad")
}

fun subrayando(cadena: String, caracter: String="=") {
    println(cadena)
    for (i in 0..cadena.length-1){
        print(caracter)
    }
    println()
}

/*
Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores fueron pares y cuántos impares.
Emplear el operador "%" en la condición de la estructura condicional:
	if (valor % 2 == 0)         //Si el if se verifica verdadero luego es par.
 */
fun paresImparesWhile() {
    var cantNumeros:Int=0
    var contador:Int=0
    var numero=0
    var pares=0
    var impares=0
    println("Cuantos numeros quieres comprobar")
    cantNumeros= readln().toInt()
    while(contador<cantNumeros){
        println("Dame el numero ${++contador}")
        numero= readln().toInt()
        if(numero%2==0) pares++
        else impares++
    }
    println("Has introducido $pares numeros pares" +
            "\nHas introducido $impares numeros impares")
}

/*
Confeccionar una aplicación que muestre una presentación en pantalla del programa. Solicite la carga de dos valores y nos muestre la suma.
Mostrar finalmente un mensaje de despedida del programa.
Implementar estas actividades en tres funciones.
 */
fun tresFunciones() {
    presentacionPrograma()
    val suma=pedirDatos()
    println("La suma de los dos numeros es $suma")
    despedidaPrograma()
}

fun despedidaPrograma() {
    println("Esto es todo amigos, Fin del Programa")
}

fun pedirDatos():Int {
    println("Numero 1")
    val num1= readln().toInt()
    println("Numero 2")
    val num2= readln().toInt()
    return num1+num2
}

fun presentacionPrograma() {
    println("Este en un programa para comprobar el uso de las funciones en Kotlin")

}

/*
    Realizar la carga de la cantidad de hijos de 10 familias. Contar cuantos tienen 0,1,2 o más hijos.
    Imprimir dichos contadores.
 */
fun HijosFamiliasWhen() {
    var hijos=0
    var contador0=0
    var contador1=0
    var contador2=0
    var contadorMasHijos=0
    for(i in 1..5){
        println("Hijos de la familia $i")
        hijos= readln().toInt()
        when(hijos){
            0 -> contador0++
            1 -> contador1++
            2 -> contador2++
            else -> contadorMasHijos++
        }
    }
    println("De las familias analizadas sacamos el siguiente informe:" +
            "\n Familias con 0 hijos: $contador0" +
            "\n Familias con 1 hijos: $contador1" +
            "\n Familias con 2 hijos: $contador2" +
            "\n Familias con +2 hijos: $contadorMasHijos")

}

/*
Realizar un programa que lea los lados de n triángulos, e informar:
    a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
    b) Cantidad de triángulos de cada tipo.
 */
fun triangulosWhen() {
    var numTriangulos:Int=0
    var lado1:Double=0.0
    var lado2:Double=0.0
    var lado3:Double=0.0
    var equilatero=0
    var isosceles=0
    var escaleno=0
    println("Cuantos triangulo vamos a analizar")
    numTriangulos= readln().toInt()
    for(i in 1..numTriangulos){
        println("Valor del lado 1 del triangulo $i")
        lado1= readln().toDouble()
        println("Valor del lado 2 del triangulo $i")
        lado2= readln().toDouble()
        println("Valor del lado 3 del triangulo $i")
        lado3= readln().toDouble()
        when{
            lado1==lado2 && lado1==lado3 -> {
                equilatero++
                println("El triangulo numero $i es Equilatero")
            }
            lado1!=lado2 && lado1!=lado3 && lado1!=lado3 ->{
                escaleno++
                println("El triangulo numero $i es Escaleno")
            }
            else -> {
                isosceles++
                println("El triangulo numero $i es Isosceles")

            }
        }

    }
    println("De los $numTriangulos triangulos analizados:" +
            "\n$equilatero son Equilateros" +
            "\n$isosceles son Isosceles" +
            "\n$escaleno son Escalenos")

}

/*
Plantear una estructura que se repita 5 veces y dentro de la misma cargar 3 valores enteros. Acumular solo el mayor del cada lista de tres valores.
 */
fun mayor3ValoresWhen() {
    var num1:Int=0
    var num2:Int=0
    var num3:Int=0
    var mayor:Int=0
    var sumaMayores:Int=0
    for (i in 0..4){
        println("Serie ${i+1}")
        println("Valor 1")
        num1= readln().toInt()
        println("Valor 2")
        num2= readln().toInt()
        println("Valor 3")
        num3= readln().toInt()
        when{
            num1>=num2 && num1>=num3 -> sumaMayores+=num1
            num2>=num1 && num2>=num3 -> sumaMayores+=num2
            num3>=num1 && num3>=num2 -> sumaMayores+=num3
        }
        println()



    }
    println("la suma de los mayores es: $sumaMayores")
}

/*
Se ingresa por teclado un valor entero, mostrar una leyenda por pantalla que indique si el número es positivo, nulo o negativo.
 */
fun positivoNegativoNuloWhen() {
    println("Dame numero")
    var numero= readln().toInt()

    when{
        numero > 0 -> println("El numero es positivo")
        numero < 0 -> println("El numero es negativo")
        else -> println("El numero es nulo")
    }
}

/*
Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
    a) La cantidad de valores ingresados negativos.
    b) La cantidad de valores ingresados positivos.
    c) La cantidad de múltiplos de 15.
    d) El valor acumulado de los números ingresados que son pares.
 */
fun AnalizarNumerosFor() {
    var numero=0
    var contadorNegativos=0
    var contadorPositivos=0
    var contadorMultiplos15=0
    var sumaPares=0

    for(i in 0..9){
        println("Introduce el numero ${i+1}")
        numero= readln().toInt()
        if(numero>0) contadorPositivos++
        if(numero<0) contadorNegativos++
        if(numero%15==0) contadorMultiplos15++
        if(numero%2==0) sumaPares+=numero
    }
    println("RESUMEN DE NUMEROS INTRODUCIDOS:" +
            "\n\tNumeros positivos:\t\t $contadorPositivos" +
            "\n\tNumeros negativos:\t\t $contadorNegativos" +
            "\n\tnumeros multiplos 15:\t $contadorMultiplos15" +
            "\n\tsuma de pares:\t\t\t $sumaPares")
}

/*
Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un triángulo.
El programa deberá informar:
    a) De cada triángulo la medida de su base, su altura y su superficie (la superficie se calcula multiplicando la base por la altura y dividiendo por dos).
    b) La cantidad de triángulos cuya superficie es mayor a 12.
 */
fun triangulosFor() {
    var base:Double=0.0
    var altura:Double=0.0
    var superficie:Double=0.0
    var contador=0
    var numTriangulos=3

    for(i in 0..numTriangulos-1){
        println("Base del triangulo ${i+1}")
        base= readln().toDouble()
        println("Altura del triangulo ${i+1}")
        altura= readln().toDouble()
        superficie=(base*altura)/2
        println("triangulo ${i+1}:" +
                "\nBase: $base" +
                "\nAltura: $altura" +
                "\nSuperficie: $superficie")
        if(superficie>12) contador++
        println()
    }
    println("De los $numTriangulos analizados $contador tienen una superficie mayor a 12")
}

/*
En un banco se procesan datos de las cuentas corrientes de sus clientes.
De cada cuenta corriente se conoce: número de cuenta y saldo actual.
El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.

Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:
    a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:
      Estado de la cuenta
            'Acreedor' si el saldo es >0.
			'Deudor' si el saldo es <0.
			'Nulo' si el saldo es =0.

    b) La suma total de los saldos acreedores.
 */
fun bancoDoWhile() {
    var numCuenta:Int=0
    var saldo:Double=0.0
    var estadoCuenta=""
    var sumaSaldos=0.0
    do{
        println("Numero de cuenta:")
        numCuenta= readln().toInt()
        if(numCuenta>=0){
            println("saldo de la cuenta: $numCuenta")
            saldo= readln().toDouble()
            if(saldo>0) {
                estadoCuenta="Acreedor"
                sumaSaldos+=saldo
            }
            else if(saldo<0) estadoCuenta="Deudor"
            else estadoCuenta="Nulo"
            println("Numero de cuenta: $numCuenta")
            println("Estado cuenta: $estadoCuenta")
        }
    }while(numCuenta>0)
    println("La suma total de los saldos acreedores es: $sumaSaldos")
}

/*
Se ingresan un conjunto de n alturas de personas por teclado (n se ingresa por teclado).
Mostrar la altura promedio de las personas.
 */
fun alturasPersonasConWhile() {
    var numPersonas:Int=0
    var contador:Int=0
    var altura:Double=0.0
    var sumaAlturas:Double=0.0
    println("Numero de personas a analizar")
    numPersonas= readln().toInt()
    while(contador<numPersonas){
        println("altura de la persona ${++contador}")
        altura= readln().toDouble()
        sumaAlturas+=altura
    }
    val promedioFormateado=String.format("%.2f",sumaAlturas/numPersonas)
    print("Promedio de las $numPersonas personas es: $promedioFormateado")



}

/*
Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
 */
fun notasConWhile() {
    var contador=0
    var mayores=0
    var menores=0
    var nota:Double=0.0
    while(contador<10){
        println("Dame nota")
        nota= readln().toDouble()
        if(nota>=7){
            mayores++
        }else{
            menores++
        }
        contador++
    }
    println("De las notas introducidas:" +
            "\n $mayores son mayores o iguales a 7" +
            "\n $menores son menores a 7")

}

/*
Escribir un programa en el cual: dada una lista de tres valores enteros ingresados por teclado se guarde en otras dos variables el menor y el mayor de esa lista.
Utilizar el if como expresión para obtener el mayor y el menor.
Imprimir luego las dos variables.
 */
fun MenorDeTresNumeros() {
    println("Numero 1")
    var num1:Int= readln().toInt()
    println("Numero 2")
    var num2:Int= readln().toInt()
    println("Numero 3")
    var num3:Int= readln().toInt()
    var mayor:Int=0
    var menor:Int=0
    if(num1>num2 && num1>num3) {
        mayor = num1
        if (num2 > num3) menor = num3
        else menor = num2
    }
    if(num2>num1 && num2>num3) {
        mayor = num2
        if (num1 > num3) menor = num3
        else menor = num1
    }
    if(num3>num1 && num3>num2) {
        mayor = num3
        if (num2 > num3) menor = num3
        else menor = num2
    }
    println("Mayor= $mayor")
    println("Menor= $menor")




}

/*
Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y (distintos a cero).
Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
 */

fun Cuadrantes() {
    var x:Int=0;
    var y:Int=0;
    do{
        println("Valor de X (Su valor no puede ser 0):")
        x= readln().toInt()
        println("Valor de y (Su valor no puede ser 0):")
        y= readln().toInt()
    }while (x==0 || y ==0)
    if(x>0 && y>0) println("1º Cuadrante")
    if(x<0 && y>0) println("2º Cuadrante")
    if(x<0 && y<0) println("3º Cuadrante")
    if(x>0 && y<0) println("4º Cuadrante")

}


/*
Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10,
imprimir en pantalla la leyenda "Alguno de los números es menor a diez".
 */
fun AlgunosNumerosMenores10() {
    println("Numero 1")
    val num1:Int= readln().toInt()
    println("Numero 2")
    val num2:Int= readln().toInt()
    println("Numero 3")
    val num3:Int= readln().toInt()
    if(num1<10 || num2<10 || num3<10) println("Alguno de los números es menor a diez")
}


/*
Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10,
imprimir en pantalla la leyenda "Todos los números son menores a diez".
 */
fun TodosNumerosMenores10() {
    println("Numero 1")
    val num1:Int= readln().toInt()
    println("Numero 2")
    val num2:Int= readln().toInt()
    println("Numero 3")
    val num3:Int= readln().toInt()
    if(num1<10 && num2<10 && num3<10) println("Menores a 10")
}

/*
Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10,
imprimir en pantalla la leyenda "Alguno de los números es menor a diez".
 */

