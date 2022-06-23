fun main() {
    ejercicio1Cuadrado()
    ejercicio1Cuadrado()
    ejercicio1Producto()


}

fun ejercicio1Producto() {
    println("Ingrese el primer número: ")
    val num1 = readLine()!!.toInt()
    println("Ingrese el segundo número: ")
    val num2 = readLine()!!.toInt()

    println("El producto de los números es : ${num1*num2}")
}


fun ejercicio1Cuadrado(){
    /*Desarrollar un programa con dos funciones.
    *  La primer solicite el ingreso de un entero
    *  y muestre el cuadrado de dicho valor.
    * La segunda que solicite la carga de dos valores
    * y muestre el producto de los mismos. LLamar desde
    *  la main a ambas funciones.
    * */
    println("Ingrese un número: ")
    val num1 = readLine()!!.toInt()
    println("El cuadrado del número es: ${num1*num1}")
}